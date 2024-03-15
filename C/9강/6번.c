#include <stdio.h>

int power(int b, int p);

int main()
{
	int b, p;

	printf("밑수:");
	scanf("%d", &b);

	printf("지수:");
	scanf("%d", &p);

	printf("%d^%d=%d\n", b, p, power(b, p));
}

int power(int b, int p)
{
	if (p > 0)
		return b * power(b, p - 1);
	else 
		return 1;
}
