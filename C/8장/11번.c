#include <stdio.h>
#include <stdlib.h>

double f_rand();

int main()
{
	for (int i = 1; i <= 5; i++)
	{
		printf("%lf",f_rand());
		printf(" ");
	}
	return 0;
}
double f_rand()
{
	
	return rand() / (double)RAND_MAX;
}
