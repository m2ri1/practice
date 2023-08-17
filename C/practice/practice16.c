/*#include <stdio.h>
void swap(int *x, int *y)//주소를 받고 포인터를 사용하여 값을 입력받음 ex)a=1004(주소), *a=2
{
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
    return ;
}
int main()
{
int a=2, b=3;
printf("함수호출 전 : a = %d, b = %d\n", a, b);
swap(&a, &b);//엠퍼샌드를 사용해 주소를 보냄
printf("함수호출 후 : a = %d, b = %d", a, b);
}*/

/*#include <stdio.h>
void swap(int *x, int *y, int *z)
{
    int temp;
    temp = *x;
    *x = *z;
    *z = *y;
    *y = temp;
   
}
int main()
{
int a, b ,c;
printf("숫자를 3개 입력하세요");
scanf("%d %d %d", &a, &b, &c);
printf("함수호출 전 : a = %d, b = %d, c = %d\n", a, b, c);
swap(&a, &b, &c);
printf("함수호출 후 : a = %d, b = %d, c = %d\n", a, b, c);

}*/

/*#include <stdio.h>
void rbm(int pxp, int pyp, int mxm, int my);
void rbmp(int *pxp, int *pyp,int mx,int my);
int main(void)
{
    int x=1;
    int y=1;
    rbm(x, y, 1, 2);
    printf("이동한 위치 (%d, %d)\n", x, y);
    rbmp(&x, &y, 1, 2);
    printf("이동한 위치 (%d, %d)\n", x, y);
    return 0;
}
void rbm(int pxp, int pyp, int mx, int my)
{
    pxp = pxp + mx;
    pyp = pyp + my;
}
void rbmp(int *pxp, int *pyp, int mx, int my)
{
    *pxp = *pxp + mx;
    *pyp = *pyp + my;
}*/

/*#include<stdio.h>
int sub(int *arr)
{
    *arr=100;
    *(arr+1)=200;
    *(arr+2)=300;
    printf("%d %d %d\n", *arr, *(arr+1), *(arr+2));
}

int main()
{
    int arr[3]={5, 10, 15};
    sub(arr);
    printf("%d %d %d\n", arr[1], arr[2], arr[3]);

}*/

/*#include<stdio.h>
int main()
{
    char p[] = "helloworld";
    char *a;
    *(p+4)='i';
    printf("%s\n", p);
    a=p;
    a = "goodbye";
    printf("%s", a);
    return 0;
}*/

 /*#include <stdio.h>
 int main(void)
 {
     char *lang[3] = {"c", "java", "python"};
     int a;
     printf("내가 배워야 할 언어는");
     for (a=0; a<3; a++)printf(" %s ", lang[a]);
    return 0;
}*/

/*#include <stdio.h>
int main(void)
{
    char address[100];
    char *addpt;
    printf("주소 입력: ");
    gets(address);
    addpt = address;
    printf("입력한 주소는 : ");
    puts(addpt);
    return 0;
}*/

#include<stdio.h>
#include<string.h>
int main(void)
{
    int i;
    int isupper, islower, isdigit;
    char mypasswd[20];
    while (1){
        printf("사용할 암호를 넣으세요 : ");
        scanf("%s", mypasswd);
        isupper = islower = isdigit = 0;
        for(i=0; i<strlen(mypasswd); i++){
            if (mypasswd[i]>='0' && mypasswd[i]<='9')
            isdigit++;
            else if (mypasswd[i]>='A' && mypasswd[i]<='Z')
            isupper++;
            else if (mypasswd[i]>='a' && mypasswd[i]<='z')
            islower++;
        }
    if ((i>=6) && (isdigit>= 1) && (isupper >= 1) && (islower >= 1)) {
        printf("암호로 사용이 가능합니다\n");
        break;
    }
    else
        printf(" 6문자 이상, 소문자, 대문자, 숫자가 각 1개씩 있어야 합니다\n");
    
    return 0;
    }
}