#include <stdio.h>

int main()
{
	int i, j, k;
	for (i = 1; i<=7 ; i++)
	{
		for ( j = 7-i; j > 0; j--)
		{
			printf(" ");
		}
		for ( k = 1; k <=i; k++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}
