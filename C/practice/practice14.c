/*#include <stdio.h>
int average(int numbe[])
{
    int a=0, i;
    for (i=0; i<10; i++)
    {
        a=a+numbe[i];
    }
    
    return a/10;
}
int main()
{
    int number[10];
    for (int i=0; i<10; i++)
    {
        scanf("%d", &number[i]);
    }
    printf("%d", average(number));
    return 0;
}*/

/*#include <stdio.h>
int jonjaljiwan(int b[])
{
    int a=0;
    for(int i=0; i<10; i++)
    {
        a=a+b[i];
    }
    return a/10;

}

int main()
{
    int number[10] = {56,69,89,51,36,87,69,74,59,70};
    printf("%d",jonjaljiwan(number));
}*/

/*#include<stdio.h>
int sosu (int number)
{
    for(int i=2; i<number; i++)
    {
    if (number%i!=1)
    return 0;
    }
    return 1;
}

int main ()
{
    int n, so;
    printf("소수 판별 프로그램\n2이상 정수 입력 : ");
    scanf("%d", &n);
    so=sosu(n);
    if (so==0)
    printf("소수가 아닙니다");
    else
    printf("소수 입니다");
    
    return 0;
}*/

#include<stdio.h>
int z;
int f(int x)
{
    x=2;
    z=z+x;
    return z;
}
int main()
{
    z=5;
    printf("%d", f(z));
    return 0;
}