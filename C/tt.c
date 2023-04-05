#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h>
#include <windows.h>
#include <math.h>
 
#pragma warning (disable : 4996)
 
#define LEFT 75
#define RIGHT 77
#define UP 72
#define DOWN 80
#define ESC 27
#define BX 5
#define BY 1
#define BW 10
#define BH 20
 
void DrawScreen();
void DrawBoard();
BOOL ProcessKey();
void PrintBrick(BOOL Show);
int GetAround(int x, int y, int b, int r);
BOOL MoveDown();
void TestFull();
void PrintPreview(BOOL Show);
void PreView();
 
void gotoxy(int x, int y)
{
    COORD Pos = { x - 1, y - 1 };
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Pos);
}
 
void CursorView(char show)//커서숨기기
{
    HANDLE hConsole;
    CONSOLE_CURSOR_INFO ConsoleCursor;
 
    hConsole = GetStdHandle(STD_OUTPUT_HANDLE);
 
    ConsoleCursor.bVisible = show;
    ConsoleCursor.dwSize = 1;
 
    SetConsoleCursorInfo(hConsole, &ConsoleCursor);
}
 
struct Point {
    int x, y;
};
 
Point Shape[][4][4] = { //테트리스모양
     { {0,0,1,0,2,0,-1,0}, {0,0,0,1,0,-1,0,-2}, {0,0,1,0,2,0,-1,0}, {0,0,0,1,0,-1,0,-2} },
     { {0,0,1,0,0,1,1,1}, {0,0,1,0,0,1,1,1}, {0,0,1,0,0,1,1,1}, {0,0,1,0,0,1,1,1} },
     { {0,0,-1,0,0,-1,1,-1}, {0,0,0,1,-1,0,-1,-1}, {0,0,-1,0,0,-1,1,-1}, {0,0,0,1,-1,0,-1,-1} },
     { {0,0,-1,-1,0,-1,1,0}, {0,0,-1,0,-1,1,0,-1}, {0,0,-1,-1,0,-1,1,0}, {0,0,-1,0,-1,1,0,-1} },
     { {0,0,-1,0,1,0,-1,-1}, {0,0,0,-1,0,1,-1,1}, {0,0,-1,0,1,0,1,1}, {0,0,0,-1,0,1,1,-1} },
     { {0,0,1,0,-1,0,1,-1}, {0,0,0,1,0,-1,-1,-1}, {0,0,1,0,-1,0,-1,1}, {0,0,0,-1,0,1,1,1} },
     { {0,0,-1,0,1,0,0,1}, {0,0,0,-1,0,1,1,0}, {0,0,-1,0,1,0,0,-1}, {0,0,-1,0,0,-1,0,1} },
};
 
enum { EMPTY, BRICK, WALL ,CLEAN};
const char *arTile[] = { ". ","■","□" ,"  "};
int board[BW + 2][BH + 2];
int nx, ny;
int brick, rot;
int p_brick , p_rot;
int score = 0;
 
void main()
{
    int nFrame, nStay;
    int x, y;
 
    CursorView(0);//커서 숨기기
    srand((unsigned)time(NULL));
    system("cls");    
 
    for (x = 0; x < BW + 2; x++) 
    {
        for (y = 0; y < BH + 2; y++) 
        {
            board[x][y] = (y == 0 || y == BH + 1 || x == 0 || x == BW + 1) ? WALL : EMPTY;
        }
    }
    DrawScreen();
    nFrame = 20;    
 
    for (; 1;)
    {
        gotoxy(50, 9); printf("점수 : %d", score);
        nx = BW / 2;
        ny = 3;
        rot = 0;
        p_rot = 0;
        brick = p_brick;
        p_brick = rand() % (sizeof(Shape) / sizeof(Shape[0]));
 
        PrintBrick(TRUE);
 
        PreView();
        //PrintPreview(FALSE);
        PrintPreview(TRUE);
 
 
        if (GetAround(nx, ny, brick, rot) != EMPTY)
            break;
        nStay = nFrame;
        for (; 2;) 
        {
            if (--nStay == 0)
            {
                nStay = nFrame;
                if (MoveDown())
                    break;
            }
            if (ProcessKey())
                break;
            Sleep(1000 / 20);
        }
    }
    system("cls");
    gotoxy(50, 12); puts("G A M E  O V E R");
    gotoxy(50, 14); printf("   점수 : %d\n\n\n\n\n",score);
    CursorView(0);//커서 숨기기
    getchar();
}
 
void DrawScreen()
{
    int x, y;
    
    for (x = 0; x < BW + 2; x++) {
        for (y = 0; y < BH + 2; y++) {
            gotoxy(BX + x * 2, BY + y);
            puts(arTile[board[x][y]]);
        }
    }
    
    gotoxy(50, 3); puts("Tetris Ver 1.0");
    gotoxy(50, 5); puts("좌우:이동, 위:회전, 아래:내림");
    gotoxy(50, 6); puts("공백:전부 내림");        
    //gotoxy(50, 7); puts("나가기 : ESC");        
}
 
void DrawBoard()
{
    int x, y;
 
    for (x = 1; x < BW + 1; x++) {
        for (y = 1; y < BH + 1; y++) {
            gotoxy(BX + x * 2, BY + y);
            puts(arTile[board[x][y]]);
        }
    }
}
 
BOOL ProcessKey()
{
    int ch, trot;
 
    if (kbhit()) {
        ch = getch();
        if (ch == 0xE0 || ch == 0) {
            ch = getch();
            switch (ch) {
            case LEFT:
                if (GetAround(nx - 1, ny, brick, rot) == EMPTY) {
                    PrintBrick(FALSE);
                    nx--;
                    PrintBrick(TRUE);
                }
                break;
            case RIGHT:
                if (GetAround(nx + 1, ny, brick, rot) == EMPTY) {
                    PrintBrick(FALSE);
                    nx++;
                    PrintBrick(TRUE);
                }
                break;
            case UP:
                trot = (rot == 3 ? 0 : rot + 1);
                if (GetAround(nx, ny, brick, trot) == EMPTY) {
                    PrintBrick(FALSE);
                    rot = trot;
                    PrintBrick(TRUE);
                }
                break;
            case DOWN:
                if (MoveDown()) {
                    return TRUE;
                }
                break;
            }
        }
        else {
            switch (ch) {
            case ' ':
                while (MoveDown() == FALSE) { ; }
                return TRUE;
            }
        }
    }
 
    return FALSE;
}
 
void PrintBrick(BOOL Show)
{
    int i;
    for (i = 0; i < 4; i++) 
    {
        gotoxy(BX + (Shape[brick][rot][i].x + nx) * 2, BY + Shape[brick][rot][i].y + ny);
        puts(arTile[Show ? BRICK : EMPTY]);
    }    
}
 
void PrintPreview(BOOL Show)
{    
    int i;
    for (i = 0; i < 4; i++)
    {
        gotoxy(28 + (Shape[p_brick][p_rot][i].x + nx) * 2, 3 + Shape[p_brick][p_rot][i].y + ny);
        puts(arTile[Show ? BRICK : CLEAN]);
    }
}
 
int GetAround(int x, int y, int b, int r)
{
    int i, k = EMPTY;
 
    for (i = 0; i < 4; i++) 
    {
        k = max(k, board[x + Shape[b][r][i].x][y + Shape[b][r][i].y]);
    }
 
    return k;
}
 
BOOL MoveDown()
{
    if (GetAround(nx, ny + 1, brick, rot) != EMPTY) 
    {
 
        TestFull();
        return TRUE;
    }
    PrintBrick(FALSE);
    
    ny++;
    PrintBrick(TRUE);
    return FALSE;
}
 
void TestFull()
{
    int i, x, y, ty;    
    
    for (i = 0; i < 4; i++) {
        board[nx + Shape[brick][rot][i].x][ny + Shape[brick][rot][i].y] = BRICK;
    }
 
    for (y = 1; y < BH + 1; y++)
    {
        for (x = 1; x < BW + 1; x++) 
        {
            if (board[x][y] != BRICK)
                break;
        }
        if (x == BW + 1) //오른쪽 맨끝
        {
            for (ty = y; ty > 1; ty--) 
            {
                for (x = 1; x < BW + 1; x++)
                {
                    board[x][ty] = board[x][ty - 1];//밑으로 한칸씩 내리기
                }
            }
 
            DrawBoard();
            score = score + 100;
            Sleep(200);        
        }
    }    
}
 
void PreView()
{
    gotoxy(35, 3); puts(" 다음블럭\n");
    gotoxy(35, 4); puts("              \n");
    gotoxy(35, 5); puts("              \n");
    gotoxy(35, 6); puts("              \n");
    gotoxy(35, 7); puts("              \n");
    gotoxy(35, 8); puts("              \n");
    gotoxy(35, 9); puts("              \n");
    gotoxy(35,10); puts("              \n");
    gotoxy(35,11); puts("              \n");
 
}