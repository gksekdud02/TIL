#include <stdio.h>

int main()
{
	int n,result=0;

	printf("정수를 입력하시오:");
	scanf("%d", &n);

	do
	{
		printf("%d", n % 10);
		n = n / 10;
	} while (n>0);
	printf("\n");
	return 0;
}
