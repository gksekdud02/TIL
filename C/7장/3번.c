#include <stdio.h>

int main()
{
	int i, n;

	printf("정수를 입력하시오:");
	scanf("%d", &i);

	for (n = 1; n <= i; n++)
	{
		if (i % n == 0)
		{
			printf("%d ", n);
		}
	}
	printf("\n");
	return 0;
}
