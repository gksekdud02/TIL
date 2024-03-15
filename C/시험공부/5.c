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
	return 0;
}

/*
  *  
 *** 
*****
*/
