//피라미드 다이아몬드 별찍기
#include<stdio.h>
int main()
{
    int a, b, c;
	for (a = 0; a < 5; a++) 
	{
		for (b=a; b < 5; b++) {
			printf(" ");
		}
		for (c = 0; c <=(a*2); c++) {
			printf("*");
		}
		printf("\n");
	}

	for (a = 5; a > 0; a--)
	{
		for (b = a; b <= 5; b++) {
			printf(" ");
		}

		for (c = 0; c <= ((a-1) * 2); c++) {
			printf("*");
		}

		printf("\n");
	}



	return 0;
}