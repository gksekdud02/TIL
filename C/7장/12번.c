#include <stdio.h>

int main()
{
	int a=0, b=1, c;
	int n;

	printf("몇번째 항까지 구할까요?");
	scanf("%d", &n);
	printf("0 1 ");

	for (int i = 0; i < n-1; i++)
	{
		c = a + b;
		printf("%d ", c);
		a = b;
		b = c;
	}
	return 0;
}
