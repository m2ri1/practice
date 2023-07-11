/*#include<stdio.h>
int main ()
{
    //포인터 주소 출력,  %p사용
    int a[] = {1, 2, 3, 4};
    printf ("*a = %p\n", a);
    printf (" *(a+1) = %p\n", (a+1));
    printf (" *(a+2) = %p\n", (a+2));
    //포인터 값 출력, %u 사용
    printf ("*a = %u\n", *a);
    printf (" *(a+1) = %u\n", *(a+1));
    printf (" *(a+2) = %u\n", *(a+2));
    printf("%d\n", sizeof a);
    int *b;
    printf("%d", sizeof b);
    return 0;
}*/

#include <stdio.h>
int total = 0;
int sumpt(int *pt)
{
    for (int i=0; i<5; i++)
    {
        if (*(pt+i)%2==0)
        total = total+ *(pt+i);
    }
    return total;
    
}

int main()
{
    int numpt[5] = {10, 12, 15, 17, 16};
    printf("%d", sumpt(numpt));
    return 0;
}