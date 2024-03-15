#include <stdio.h>

void positional_number(int n);

int main()
{
	int n;
	printf("정수를 입력하시오:");
	scanf("%d", &n);

	positional_number(n);

	return 0;
}

void positional_number(int n)
{
	static int count;

	if (n > 0)
	{
		count++;
		positional_number(n / 10);
	}
	else
		printf("자리수의 개수: %d\n", count);
}
