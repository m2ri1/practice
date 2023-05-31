/*#include <stdio.h>

struct myGrade {
    char *name;
    int korean;
    int english;
    int math;
};

void grade (struct myGrade st)
{
    st.name ="박미리";

    printf("성명 %s, 국어 %d점, 영어 %d점, 수학 %d점\n", st.name, st.korean, st.english, st.math);
}

int main()
{
    struct myGrade kmy = {"강모연", 100, 100, 100};
    grade(kmy);

    return 0;
}*/

/*#include <stdio.h>
struct mygrade {
    char *name;
    int korean;
    int engilsh;
    int math;
};
int main(void)
{
    struct mygrade myclass[20];
    myclass[0].name = "강모연";
    myclass[1].name = "서대영";
    myclass[0].korean = 100;
    myclass[1].math = 84;
    printf("%s의 국어점수는 %d\n", myclass[0].name, myclass[0].korean);
    printf("%s의 수학점수는 %d\n", myclass[1].name, myclass[1].math);
}*/

/*#include <stdio.h>
struct studentinfo {
    int stnum;
    char *name;
    int stage;

};
int main(void)
{
    struct studentinfo myinfo[5];
    myinfo[0].stnum = 9;
    myinfo[0].name = "박미리";
    myinfo[0]. stage = 17;
    printf("번호 : %d\n",myinfo[0].stnum );
    printf("이름 : %s\n",myinfo[0].name );
    printf("나이 : %d",myinfo[0].stage);
    return 0;
}*/


#include <stdio.h>
#include <string.h>
struct contacts{
    char name[10];
    char office[20];
    char phone[15];
};
int main(void)
{
    struct contacts customer[20];
    printf("성명을 입력하세요\n");
    scanf("%s",&customer[0].name);
    printf("회사 명을 입력하세요\n");
    scanf("%s",&customer[0].office);
    printf("전화번호를 입력하시오\n");
    scanf("%s",&customer[0].phone);
    printf("------------------------\n");
    printf("%s\n",customer[0].name);
    printf("%s\n",customer[0].office);
    printf("%s\n",customer[0].phone);
}*/

