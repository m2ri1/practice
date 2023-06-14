#include <stdio.h>
struct myGrade //구조체 선언
{   
    char *name;
    int korean;
    int english;
    int math;

};
void grade(struct myGrade st)
{
    printf("성명: %s, 국어 %d 점, 영어 %d 점, 수학 %d점\n", st.name, st.korean, st.english, st.math);
}
void student(struct myGrade myClass[])
{
    printf("%s 의 프밍 점수는 %d\n", myClass[0].name, myClass[0].korean);
    printf("%s 의 컴시일 점수는 %d\n", myClass[1].name, myClass[1].math);
}
int main(){

    struct myGrade pmr = {"박미리", 100, 100, 100};
    struct myGrade kys = {"김유성", 0, 0, 0};
    grade(pmr);
    grade(kys);
    struct myGrade myClass[2];
    myClass[0].name = "김유성";
    myClass[1].name = "유성김";
    myClass[0].korean = 34;
    myClass[1].math = 50;
    student(myClass);

    return 0;
}