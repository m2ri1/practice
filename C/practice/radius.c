#include <stdio.h>
int main() {
    float radius, area;
    printf("반지름의 값을 입력하세요\n");
    scanf("%f", &radius);
    printf("면적의 값은 %f", 3.141592*2*radius);
    return 0;

}