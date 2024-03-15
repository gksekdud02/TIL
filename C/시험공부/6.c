#include <stdio.h>

int main()
{
	for (int i = 1; i <= 3; i++)
	{
		for (int j = 2; j >= i; j--)
		{
			printf(" ");
		}
		for (int k = 1; k < i + 1; k++)
		{
			printf("*");
		}
		for (int n = 0; n < i-1; n++)
		{
			printf("*");
		}
		printf("\n");
	}

	for (int i = 1; i <= 2; i++)
	{
		for (int j = 1; j < i + 1; j++)
		{
			printf(" ");
		}
		for (int j = 3; j > i; j--)
		{
			printf("*");
		}
		for (int n = 1; n >= i; n--)
		{
			printf("*");
		}
		printf("\n");
	}
	
	return 0;
}

/*
  *
 ***
*****
 ***
  *
*/
