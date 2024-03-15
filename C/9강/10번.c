#include <stdio.h>

double recursive(int n);

int main()
{
	printf("%lf\n", recursive(10));
	return 0;
}

double recursive(int n)
{
	if (n == 1)
		return 1.0;
	else
		return 1.0 / n + recursive(n - 1);
}
