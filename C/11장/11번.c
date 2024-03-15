#include <stdio.h>

void merge(int* A, int* B, int* C, int size);

int main()
{
	int A[] = { 2,5,7,8 };
	int B[] = { 1,3,4,6 };
	int C[100];

	printf("A[]= ");
	for (int i = 0; i < 4; i++)
	{
		printf("%d ", A[i]);
	}
	printf("\n");


	printf("B[]= ");
	for (int i = 0; i < 4; i++)
	{
		printf("%d ", B[i]);
	}
	printf("\n");

	merge(A, B, C, 4);

	printf("C[]= ");
	for (int i = 0; i < 8; i++)
	{
		printf("%d ", C[i]);
	}
	printf("\n");

}

void merge(int* A, int* B, int* C, int size)
{
	int a=0, b=0, c=0;
	while (a != 4 && b != 4)
	{
		if (*(A + a) < *(B + b))
		{
			*(C + c) = *(A + a);
			a++, c++;
		}
		else
		{
			*(C + c) = *(B + b);
			b++, c++;
		}
	}
	
	if (b == 4)
	{
		while (a != 4)
		{
			*(C + c) = *(A + a);
			a++, c++;
		}
	}
	else if (a == 4)
	{
		while (b != 4)
		{
			*(C + c) = *(B + b);
			b++, c++;
		}
	}
}
