#include <stdio.h>

int main()
{
	int n, r, result = 1;

	printf("n의 값");
	scanf("%d", &n);

	printf("r의 값");
	scanf("%d", &r);

	for (int i = n; i >= n - (r - 1); i--)
	{
		result *= i;
	}
	printf("순열의 값은 %d입니다.\n", result);

	return 0;
}
