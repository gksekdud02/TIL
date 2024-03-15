#include <stdio.h>

int main()
{
	for (int i = 1; i <= 3; i++)
	{
		for (int j = 1; j < i; j++)
		{
			printf(" ");
		}
		for (int k = 4; k > i; k--)
		{
			printf("*");
		}
		for (int n = 2; n >= i; n--)
		{
			printf(" ");
		}
		for (int m = 1; m < i + 1; m++)
		{
			printf("*");
		}
		printf("\n");
	}
	for (int i = 1; i <= 3; i++)
	{
		for (int j = 4; j > i; j--)
		{
			printf("*");
		}
		for (int k = 1; k < i ; k++)
		{
			printf(" ");
		}
		for (int n = 1; n < i + 1; n++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}

/*
***  *
 ** **
  ****
****
** **
*  ***
*/
