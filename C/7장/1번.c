#include <stdio.h>

int main()
{
	int i, j;
	printf("카운터의 초기값을 입력하시오:");
	scanf("%d", &i);

	for (j = i; j >= 1; j--)
	{
		printf("%d ", j);
	}
	printf("\n");
	return 0;
}
