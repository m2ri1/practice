#include <stdio.h>

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
}