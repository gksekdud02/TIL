#include <stdio.h>
#include <stdlib.h>
#define SIZE 10

void array_fill(int* a, int size);

int main()
{
	int a[SIZE];

	array_fill(a, SIZE);

	for (int i = 0; i < SIZE; i++)
	{
		printf("%d ", a[i]);
	}
	printf("\n");

	return 0;
}

void array_fill(int* a, int size)
{
	for (int i = 0; i < SIZE; i++)
	{
		 *(a+i)= rand();
	}
}
