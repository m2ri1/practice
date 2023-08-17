/*#include <stdio.h>// 1번 sizeof 연산을 이용해 정수형 및 실수형 기본 자료형의 크기를 알아보는 프로그램 작성
int main()
{
    printf("%d, %d, %d, %d\n", sizeof(char), sizeof(short), sizeof(int), sizeof(long));
    printf("%d, %d", sizeof(float), sizeof(double));
    return 0;
}*/

/*#include <stdio.h>// 2번 영문자 대문자 한글자를 입력하면 소문자로 변환해주는 프로그램을 작성
int main ()
{
  char i;
  printf("영어 대문자 1개를 입력하세요\n");
  putchar('>');
  scanf("%c", &i);
  printf("%c", i+32);
  return 0;
}*/

/*#include <stdio.h>// 3번 두 개의 숫자를 입력받아 a, b 변수에 저장하고 a, b 변수의 값을 바꿔서 출력하는 프로그램을 작성
int main ()
{
  int a, b, temp;
  printf("숫자 2개를 입력하세요\n");
  putchar('>');
  scanf("%d %d", &a, &b);
  temp=a;
  a=b;
  b=temp;
  printf("%d %d", a, b);
  return 0;
}*/

/*#include <stdio.h>// 4번 숫자를 입력하면 8진수, 16진수, 아스키 코드로 바꾸어 출력하는 프로그램을 작성
int main ()
{
  int i;
  printf("숫자 1개를 입력하세요\n");
  putchar('>');
  scanf("%d", &i);
  printf("8진수는 %o 입니다\n", i);
  printf("16진수는 %x 입니다\n", i);
  printf("아스키코드는 %c 입니다", i);
  return 0;
}*/

#include <stdio.h>// 5번 영문자와 키 값을 입력하면 암호화한 문자를 출력하는 프로그램을 작성
int main ()
{
  char i;
  int key;
  printf("영문자 1개를 입력하세요\n");
  putchar('>');
  scanf("%c", &i);
  printf("키 값을 입력하세요\n");
  scanf("%d", &key);
  printf("해당 문자를 암호화한 문자는 %c 입니다", (i-32)+key);
  return 0;
}
