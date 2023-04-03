/*#include <stdio.h>//1-100정수중 7과 9의 배수 한번씩만 출력
int main() 
{
  int i;
  for(i=1; i<=100; i++)
    {
      if (i%7==0)
      {
        printf("%d\n", i);
        continue;
      }

       if(i%9==0) 
        {
        printf("%d\n", i);
        }
    }
  return 0;
}*/


/*#include <stdio.h>//두개 정수 입력받아서 큰 수에서 작은수 뺀 값 출력
int main() 
{
  int a,b, sum;
  scanf("%d %d", &a, &b);
  if (a>b)
  printf("%d", a-b);
  if (a<b)
  printf("%d", b-a);
  return 0;
}*/


/*#include <stdio.h>
int main()
{
  int a, b, c, i;
  printf("성적을 입력하세요");
  scanf("%d %d %d", &a, &b, &c);
  i=(a+b+c)/3;
  printf("전체 평균 : %d\n",i);
  if (i>=90){
    printf("학점 : A");
  }
  else if(i>=80){
    printf("학점 : B");
  }
   else if(i>=70){
    printf("학점 : C");
  }
   else if(i>=60){
    printf("학점 : D");
  }
  else if(i<60){
    printf("학점 : F");
  }

  return 0;
}*/