#include <stdio.h>

int main()
{
	int n, result;

	printf("n의 값을 입력하시오 :");
	scanf("%d", &n);

	result = 0;

	for (int i = 1; i <= n; i++)
	{
		result += i * i;
	}
	printf("계산값은 %d입니다.\n", result);
	return 0;
}
