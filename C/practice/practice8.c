/*#include<stdio.h>//void에서 선언한 변수는 지역변수이므로 main의 num2가 출력

void add()
{
    int num1;
    int num2;
    num1= 10;
    num2 = num1*2;
}
int main()
{
    int num2=5;
    add();
    printf("%d", num2);
    return 0;
}*/

/*#include <stdio.h>
int num1;
int num2;
void add()
{
    num1 = 10;
    num2 = num1*2;
}
int main()
{
    add();
    printf("%d", num2);
    return 0;
}*/

#include <stdio.h>
#include "myfucn.h"

int main()
{
    int num2=5;
    add();
    printf("%d\n", num2);
    printf("%d", num1);
    return 0;
}
