#include <Stdio.h>

int get_digit_sum(int n);

int main()
{
	int n;

	printf("정수를 입력하시오:");
	scanf("%d", &n);

	printf("자리수의 합:%d\n", get_digit_sum(n));

	return 0;
}

int get_digit_sum(int n)
{
	if (n == 0)
		return 0;
	else
		return ((n % 10) + get_digit_sum(n / 10));
}
