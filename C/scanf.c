#include<stdio.h>//숫자를 배열에 입력받고 짝수 번째에 입력한 수만 출력
int main()
{
    int number[100];
    for(int i=0; i<100; i++)
    {
        printf("숫자를 입력하세요 >");
        scanf("%d", &number[i]);
        if (number[i]==0)
            break;
    
    }
for(int j=0; j<100; j++)
{
    j++;
    if (number[j]==0)
    {
        break;
    }
    else
    printf("%d\n", number[j]);
}
return 0;
}