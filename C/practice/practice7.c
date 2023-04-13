#include<stdio.h>
int triangle(int x, int y, int z)
{
    if ((x+y<=z)|(x+z<=y)|(z+y<=x))
        return 0;

    else
        return 1;
}

int main(void)
{
int x, y, z;

printf("세 변의 길이를 입력하세요\n");
putchar('>');
scanf("%d %d %d", &x, &y, &z);
triangle(x, y, z);
if(triangle(x, y, z)==1)
    printf("삼각형이 뚝딱 완성");
else
    printf("삼각형 안됨");
return 0;
}

