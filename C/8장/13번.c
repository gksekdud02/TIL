#include <stdio.h>

int is_multiple(int n, int m);

int main()
{
	int n, m;
	int mul;

	printf("첫번째 정수를 입력하시오:");
	scanf("%d", &n);

	printf("두번째 정수를 입력하시오:");
	scanf("%d", &m);
	
	mul = is_multiple(n, m);

	if (mul== 1)
	{
		printf("%d는 %d의 배수입니다.\n", n, m);
	}

	return 0;
}

int is_multiple(int n, int m)
{
	if (n % m == 0)
		return 1;
	else
		return 0;
}
