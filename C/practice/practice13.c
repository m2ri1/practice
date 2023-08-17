/*#include<stdio.h>
#include<math.h>
int main()
{
    double s1, s2;
    printf("두 변의 길이를 입력하시오.\n");
    scanf("%lf %lf", &s1, &s2);
    printf("빗변의 길이는 %lf입니다.", sqrt((s1*s1)+(s2*s2)));
    return 0;
}*/

#include <stdio.h>
float inch(float a)
{
    return a*0.393701;
}
int main()
{
    float i, in;
    printf("숫자를 입력하세요\n");
    putchar('>');
    scanf("%f", &i);
    in= inch(i);
    printf("%f 는 %f inch", i,in );
    return 0;
}