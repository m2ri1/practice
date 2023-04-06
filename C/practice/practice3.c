/*#include <stdio.h>
int main()
{
    int i, salary;
    int money[10] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
    int count[10];
    printf("월급 입력하쇼\n");
    scanf("%d", &salary);
    for (i = 0; i < 10; i++)
    {
        count[i] = salary/money[i];
        salary = salary - money[i]*count[i];
    }
    for ( i = 0; i < 10; i++)
    {
        printf("%5d원 : %d\n", money[i], count[i]);
    }
    return 0;
}*/

/*#include <stdio.h> // 배열 변수에 숫자 10개를 입력받아서 그 수들의 평균 구해 출력
int main()
{
    int number[10], i, total=0;
    printf("숫자를 입력하세요\n");
    for (i=0; i<10; i++)
    {
        printf(">");
        scanf("%d", &number[i]);
    }
 
     printf("\n");
    for (i=0; i<10; i++)
    {
        total+=number[i];
    }
    printf("입력한 수의 평균은 %d\n", total/10);
    return 0;

}*/

#include <stdio.h> // 배열 변수에 숫자 10개를 입력받고 가장 큰수와 가장 작은 수를 제외한 뒤 평균 값 출력
int main()
{
    int number[10], i, total=0, max, min=2147483647;
    printf("숫자를 입력하세요\n");
    for (i=0; i<10; i++)
    {
        printf(">");
        scanf("%d", &number[i]);
        if (number[i]>max)
        max=number[i];
        if (number[i]<min)
        min=number[i];
    }
 
     printf("\n");
    for (i=0; i<10; i++)
    {
        total+=number[i];
    }
    printf("입력한 수의 평균은 %d, 가장 큰수는 %d, 가장 작은수는 %d\n", total/10, max, min);
    total= total-max-min;
    printf("최댓값과 최솟값을 제외한 나머지의 평균은 %d", total/8);
    return 0;

}