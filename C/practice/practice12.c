/*#include <stdio.h>
int main()
{
    int rabbit[11], a;
    int b=1;
    int c=2;
    for (a=0; a<11; a++)
    {
        b=a+1;
        c=a+b;
        c=rabbit[a];
    }
    printf("%d", rabbit[10]);
    return 0;

}*/

/*#include <stdio.h>
int main()
{
    int a=1, b=2, c=0, i;
    for(i=0; i<8; i++)
    {
        c=a+b;
        a=b;
        b=c;

    }
    printf("%d", c);
}*/

/*#include <stdio.h>

int fibo(int num);
int main()
{
    int num;
    printf("\n개월 수 입력: ");
    scanf("%d", &num);
    printf("총 토끼 쌍: %d", fibo(num+1));
    return 0;
}
int fibo(int num)
{
    if(num == 0) return 0;
    else if(num == 1) return 1;
    else return fibo(num - 1) + fibo(num - 2);
}*/

#include <stdio.h>/// 중복되는 난수 빼고 출력하기
#include <stdlib.h>
#include <time.h>
int main(void)
{
    int a, number[10];
    srand((unsigned)time(NULL));
    for (a=0; a<10; a++)
    printf("%d", 1+rand()%6);

    return 0;
}