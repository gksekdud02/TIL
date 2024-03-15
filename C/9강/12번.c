#include <stdio.h>
#include <stdio.h>

int fib(int n);

int main()
{

	for (int i = 0; i <= 9; i++)
	{
		printf("fib(%d)=%d\n", i, fib(i));
	}
}

int fib(int n)
{
	if (n == 0)
		return 0;
	else if (n == 1)
		return 1;
	else
		return fib(n - 2) + fib(n - 1);
}
