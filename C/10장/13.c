#include <stdio.h>

int main()
{
	int binary[32] = { 0 };
	int n;
	
	printf("n의 값:");
	scanf("%d", &n);
	printf("%d -> ",n);

	for (int i = 0; i < 32&& n>0; i++)
	{
		binary[i] = n % 2;
		n = n / 2;
	}
	
	int i;
	for (i = 31; i >= 0; i--)
	{
		if (binary[i] == 1)
		{
			break;
		}
	}
	for (; i >= 0; i--)
	{
		printf("%d", binary[i]);
	}
	printf("\n");
	return 0;
}
