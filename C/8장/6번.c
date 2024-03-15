#include <stdio.h>
int even(int n);
int absolute(int n);
int sign(int n);

int main()
{
	int n;
	int even_n, sign_n;

	printf("정수를 입력하시오:");
	scanf("%d", &n);

	even_n = even(n);
	sign_n = sign(n);

	printf("even()의 결과:");
	if (even_n == 1)
		printf("짝수\n");
	else
		printf("홀수\n");

	printf("absolute()의 결과:%d\n", absolute(n));

	printf("sign()의 결과:");
	if (sign_n == 1)
		printf("양수\n");
	else if (sign_n == -1)
		printf("음수\n");
	else
		printf("0\n");

}

int even(int n)
{
	if (n % 2 == 0)
		return 1;
	else
		return 0;
}

int absolute(int n)
{
	if (n > 0)
		return n;
	else
		return (-n);
}

int sign(int n)
{
	if (n < 0)
		return -1;
	else if (n > 0)
		return 1;
	else
		return 0;
}
