/*#include <stdio.h>
int totalscore(int grade[])
{
    int countsubject, sum=0;
    for(countsubject=0; countsubject<4; countsubject++)
    {
        sum = sum+grade[countsubject];
    }
    return sum;
}
int main()
{
    int stscore1[5] = {87, 92, 95, 91, 0};
    int stscore2[5] = {68, 95, 76, 88, 0};
    int stscore3[5] = {77, 88, 91, 87, 0};
    int stscore4[5] = {78, 81, 96, 76, 0};
    stscore1[4] = totalscore(stscore1);
    printf("1번 학생의 총점은 %d\n", stscore1[4]);

    stscore2[4] = totalscore(stscore2);
    printf("2번 학생의 총점은 %d\n", stscore2[4]);

    stscore3[4] = totalscore(stscore3);
    printf("3번 학생의 총점은 %d\n", stscore3[4]);

    stscore4[4] = totalscore(stscore4);
    printf("4번 학생의 총점은 %d\n", stscore4[4]);
    return 0;
}*/

#include <stdio.h>
double average(double stscore[])
{
    int countsubject;
    double result = 0;
    for(countsubject = 0; countsubject<4; countsubject++)
    result += stscore[countsubject];
    return result/4;
}

int main()
{

    double stscore1[5] = {87, 92, 95, 91, 0};
    double stscore2[5] = {68, 95, 76, 88, 0};
    double stscore3[5] = {77, 88, 91, 87, 0};
    double stscore4[5] = {78, 81, 96, 76, 0};

  
    stscore1[4] = average(stscore1);
    printf("1번 학생 점수의 평균은 %f\n", stscore1[4]);

    stscore2[4] = average(stscore2);
    printf("2번 학생 점수의 평균은 %f\n", stscore2[4]);

    stscore3[4] = average(stscore3);
    printf("3번 학생 점수의 평균은 %f\n", stscore3[4]);

    stscore4[4] = average(stscore4);
    printf("4번 학생 점수의 평균은 %f\n", stscore4[4]);

    return 0;
}

