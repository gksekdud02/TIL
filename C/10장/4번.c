#include <stdio.h>
#define SIZE 10

void array_copy(int a[], int b[], int size);

int main()
{
	int a[SIZE] = { 1,2,3,0,0,0,0,0,0,0 };
	int b[SIZE];

	array_copy(a, b, SIZE);

	for (int i = 0; i < SIZE; i++)
	{
		printf("%d ", a[i]);
	}
	printf("\n");

	for (int i = 0; i < SIZE; i++)
	{
		printf("%d ", b[i]);
	}
	printf("\n");
}

void array_copy(int a[], int b[], int size)
{
	for (int i = 0; i < SIZE; i++)
	{
		b[i] = a[i];
	}
}
