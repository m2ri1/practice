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

#include <string.h>
struct member {
char num[10];
char name[10];
char phone[20];
};

struct member staff[5] =
{
    {"s2001002","강대영","010-1234-0001"},
    {"s2006012","김길수","010-1234-0002"},
    {"s2011007","이미영","010-1234-0003"},
    {"s2012005","이도엽","010-1234-0004"},
    {"s2016001","권순동","010-1234-0005"}
};
int main() {
    char inputName[10];
    printf("찾는 이름을 입력하세요: ");
    scanf("%s", inputName);

    int i;
    for (i = 0; i < 5; i++) {
        if (strcmp(staff[i].name, inputName) == 0) {
            printf("사원번호: %s\n", staff[i].num);
            printf("이름: %s\n",staff[i].name);
            printf("전화번호: %s\n", staff[i].phone);
            break;
        }
    }

    if (i == 5) {
        printf("일치하는 이름이 없습니다.\n");
    }

    return 0;
}

#include <stdio.h>

struct data{
    char *name;

}
int main()
{
    struct data pencil;
    struct data erase;
    struct data clolr;
    struct data* head;
    head = &pencil;
    pencil.name = "연필";
    erase.name = "지우개";
    
}