#include <stdio.h>

int sum(int n);

int main()
{
	int n;

	printf("정수를 입력하시오:");
	scanf("%d", &n);

	printf("1부터 10까지의 합=%d\n", sum(n));
}

int sum(int n)
{
	if (n != 0)
		return n + sum(n - 1);
	else
		return n;
}
