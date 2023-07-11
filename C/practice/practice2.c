#include <stdio.h>//2차원 배열 사용
int main()
//1행과 2행 값 출력
//1행과 2행 더한 값 출력
//2행에서 1행 뺀 값 출력
//3행과 4행 곱한 값 역순으로 출력
{
    int x, b=9;
    int number [5][10] = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},{11, 12, 13, 14, 15, 16, 17, 18, 19, 20}};
    for (x=0; x<10; x++)
        printf("%d\n", number[0][x]);

        printf("\n");

    for (x=0; x<10; x++)
        printf("%d\n", number[1][x]);

        printf("\n");

    for (x=0; x<10; x++)
    {
        number[2][x] = number[0][x]+number[1][x];
        printf("%d\n", number[2][x]);
    }
    printf("\n");
    for (x=0; x<10; x++)
    {
        number[3][x] = number[1][x]-number[0][x];
        printf("%d\n", number[3][x]);
    }
    printf("\n");
    for (x=0; x<10; x++)
    {
        number[4][x] = number[2][b]*number[3][b];
        printf("%d\n", number[4][x]);
        b--;
        
    }
    return 0;
}
