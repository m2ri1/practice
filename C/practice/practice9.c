//함수 사용
#include <stdio.h>
int result(int i);
int main ()
{
int number;
printf("숫자를 입력하세요\n");
putchar('>');
scanf("%d", &number);
if(result(number)==1)
printf("홀수입니다");
else
printf("짝수입니다");
}

int result(int i)
{
    if (i%2==0)
    return 0;
    else 
    return 1;
}

/*#include<stdio.h>
int main()
{
    int i;
    scanf("%d", &i);
    if (i%2==0)
    printf("짝수입니다");
    else
    printf("홀수입니다");
    
}*/