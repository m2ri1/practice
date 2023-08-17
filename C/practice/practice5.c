/*#include <stdio.h>

int plu(int);

int main()
{
    int a, b;
    scanf("%d %d", &a, &b);
    plu(a, b);
    return 0;
}

int plu(int x, int y)
{
    printf("%d", a+b);
    return x+y;
}*/

/*#include <stdio.h>

int plu(int, int);
int plua(int, int);
int plub(int, int);
int pluc(int, int);

int main()
{
    int a, b;
    printf("두 수를 입력하세요\n");
    printf(">");
    scanf("%d %d", &a, &b);
    printf("덧셈 결과 : %d\n", plu(a,b));
    printf("뺄셈 결과 : %d\n", plua(a,b));
    printf("곱셈 결과 : %d\n", plub(a,b));
    printf("나눗셈 결과 : %d\n", pluc(a,b));
    return 0;
}

int plu(int x, int y)
{
    return x+y;
}
int plua(int x, int y)
{
    return x-y;
}
int plub(int x, int y)
{
    return x*y;
}
int pluc(int x, int y)
{
    return x/y;
}*/

/*#include <stdio.h>
int max(int a, int b, int c);
int min(int a, int b, int c);

int main()
{
    int a, b, c;
    scanf("%d, %d, %d", &a, &b, &c);
    printf("가장 큰 수 : %d\n", max(a,b,c));
    printf("가장 작은 수 : %d\n", min(a,b,c));
    return 0;
}
int max(int a, int b, int c)
{
    if(a>b){
        if(a>c) 
        {
            return a;
        }
        else if (a<c)
        {
            return c;
        } 
        else
        {
            return b;
        } 
    }
}

int min(int a, int b, int c)
{
      if(a<b){
        if(a<c) 
        {
            return a;
        }
        else if (a>c)
        {
            return c;
        } 
        else
        {
            return b;
        } 
    }
}*/

#include <stdio.h>

void max_min(int a, int b, int c, int max, int min) {
    if (a >= b && a >= c) {
        max = a;
    } else if (b >= a && b >= c) {
        max = b;
    } else {
        max = c;
    }

    if (a <= b && a <= c) {
        min = a;
    } else if (b <= a && b <= c) {
        min = b;
    } else {
        min = c;
    }

    printf("가장 큰 수: %d\n", max);
    printf("가장 작은 수: %d\n", min);
}

int main(void) {
    int a, b, c, max, min;
    printf("숫자를 입력하세요: ");
    scanf("%d %d %d", &a, &b, &c);
    max_min(a, b, c, max, min);
    return 0;
}