#include <stdio.h> // strcmp 함수 (strcmp(변수, 변수 2))
#include<string.h> // 문자열 두개가 같은경우 0을 반환, 그렇지 않은경우 0이 아닌 값을 반환
int main()
{
    
    int a;
    char *spring[6] = {"입춘", "우수", "경칩", "춘분", "청명", "곡우"};
    char tname[10];
    scanf("%s", tname);
    for(a =0; a<6; a++)
    {
        if (strcmp(spring[a], tname)==0)
        {
            printf("%s 봄 절기입니다", tname);
              break;
    
        }
    
    }
    printf("%s 는 봄 절기가 아닙니다", tname);
    return 0;
}