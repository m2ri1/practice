#include <stdio.h>
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
