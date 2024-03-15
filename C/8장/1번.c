#include <stdio.h>
double square(double);

int main()
{
	double x;

	printf("정수를 입력하시오:");
	scanf("%lf", &x);

	printf("주어진 함수 %lf의 제곱은 %lf입니다.\n", x, square(x));

	return 0;
}

double square(double n)
{
	return n * n;
}
