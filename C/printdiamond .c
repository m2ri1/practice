#include <stdio.h>
int main ()
{
    int a, b, c;
    for (a=0; a<10; a++)
    {
        for(b=0; b<=10-a;b++)
        {
            printf(" ");
        }
        for (c=0; c<=a*2; c++)
        {
            printf("*");
        }
        putchar('\n');
    }

    for (a=0; a<11; a++)
    {
        for(b=0; b<=a;b++)
        {
            printf(" ");
        }
        for (c=0; c<=(10-a)*2; c++)
        {
            printf("*");
        }
        putchar('\n');
    }
    
    return 0;
}



/*
#include <stdio.h>// 입력한 수에 따라 다이아몬드 출력
int main()
{
    int i, j, k, num;
    printf("숫자를 입력 해봐!\n");
    printf(">");
    scanf("%d", &num);
    if (num % 2 == 0)
    {
        printf("홀수가 아님\n");
    }
  else
    {
    for (i = 0; i < num--; i++)
    {
        for (j = 0; j <= 10 - i; j++)
        {
            printf(" ");
        }
        for (k = 0; k <= 2 * i; k++)
        {
            printf("*");
        }
        printf(" ");
      printf("\n");
    }
    for (i = num--; i >= 0; i--)
    {
        for (j = 10 - i; j >= 0; j--)
        {
            printf(" ");
        }
        for (k = 2*i; k >= 0; k--)
        {
            printf("*");
        }
        printf(" ");
      printf("\n");
    }
  }
    return 0;
}
*/