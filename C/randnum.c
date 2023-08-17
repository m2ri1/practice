#include <stdio.h>
#include <stdlib.h> 
#include<time.h>
int main()
{
    int count, randnum, a;
    srand((unsigned)time(NULL));
    randnum = rand()%101;
    for (int i=0; i<5; i++)
    {
        printf("숫자를 맞춰보세요\n");
        printf(">");
        scanf("%d", &a);
        if (a==randnum)
        {
            printf("***정답!! %d 번 만에 맞췄습니다!***", i+1);
        return 0;
        }
        else
        {
        printf("틀렸습니다 ");
            if (a<randnum)
            printf("컴퓨터가 생각한 숫자가 더 큽니다 ");
            else
            printf("컴퓨터가 생각한 숫자가 더 적습니다 ");
        }
        
    }
    printf("\n***실패***");
    printf("정답은 %d 입니다!!!하하!!!", randnum);
    return 0;
} 


/*#include<stdio.h>
#include <stdlib.h> 
#include<time.h>
int coin()
{
    int random;
    random = rand()%9;
    if (random%2==1)//홀수
    return 1;
    else//짝수
    return 0;
}

int main()
{
    int hol=0, jak=0;
    srand((unsigned)time(NULL));
    for(int i=0; i<100; i++)
    {
        if (coin()==1)
        hol ++;
        else
        jak ++;

    }
    
    printf("동전의 앞면 : %d\n", jak);
    printf("동전의 뒷면 : %d", hol);
    return 0;
}*/