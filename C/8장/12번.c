#include <stdio.h>

void print_value(int n);

int main()
{
	int n;

	while (1)
	{
		printf("값을 입력하시오(종료는 음수):");
		scanf("%d", &n);

		print_value(n);

		if (n == -1)
			break;

		printf("\n");
	}
	
	return 0;
}

void print_value(int n)
{
	for (int i = 1; i <= n; i++)
	{
		printf("*");
	}
}
