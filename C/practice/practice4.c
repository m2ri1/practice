//제어문 사용


#include <stdio.h>//숫자 9개를 3*3배열에 저장후 출력
int main ()
{
    int number[3][3];
    int x=0,y=0,i;
    printf("숫자를 9번 입력하세요\n");
    for(i=0; i<9; i++)
    {
        printf(">");
        scanf("%d", &number[x][y]);
        if(y==2)
        {
            y=0;
            x++;
        }
        else
        {
            y++;
        }

    }
    printf("입력한 숫자 출력\n");
    x=0;
    y=0;
      for(i=0; i<9; i++)
    {
        printf("%d", number[x][y]);
        if(x==2)
        {
            x=0;
            y++;
          printf("\n");
        }
        else
        {
            x++;
        }

    }
    return 0;
}

#include <stdio.h>//숫자 9개를 3*3배열에 세로 순서대로 저장후 출력
int main ()
{
    int number[3][3];
    int x=0,y=0,i;
    printf("숫자를 9번 입력하세요\n");
    for(i=0; i<9; i++)
    {
        printf(">");
        scanf("%d", &number[x][y]);
        if(y==2)
        {
            y=0;
            x++;
        }
        else
        {
            y++;
        }

    }
    printf("입력한 숫자 출력\n");
    x=0;
    y=0;
      for(i=0; i<9; i++)
    {
        printf("%d ", number[x][y]);
        if(x==2)
        {
            x=0;
            y++;
          printf("\n");
        }
        else
        {
            x++;
        }

    }
    return 0;
}
