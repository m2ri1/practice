// 반복문
#include <stdio.h>
int hol(void);
int jak(void);
int main()
{
    int a=hol();
    int b=jak();
    printf("%d\n", a);
    printf("%d", b);
    return 0;
}

int hol(void)
{
    int h=0, i;
    for (i=0; i<=100; i++)
    {
        if (i%2==1)
        h+=i;
    }
    return h;
}
int jak(void)
{
    int j=0, i;
    for (i=0; i<=100; i++)
    {
        if (i%2==0)
        j+=i;
    }
    return j;
}

/*#include<stdio.h>
int number(int a);
int main()
{
    int i, result;
    printf("숫자를 입력하세요\n");
    putchar('>');
    scanf("%d", &i);
    result = number(i);
    printf("%d", result);
}

int number(int a)
{
    int sum=1;
    for(int x=1; x<=a; x++)
    {
        sum*=2;
    }
    return sum;
}*/

#include <stdio.h>
int add(int a);
int main()
{
    int sum, result;
    printf("숫자 입력하세요\n");
    putchar('>');
    scanf("%d", &sum);
    result = add(sum);
    printf("%d", result);
}
int add(int a)
{
    return a+1;
}