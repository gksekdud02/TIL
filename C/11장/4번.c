#include <stdio.h>

void array_print(int* A, int size);

int main()
{
	int A[10] = { 1,2,3,4,5 };

	array_print(A, 10);

	return 0;
}

void array_print(int* A, int size)
{
	printf("A[]={ ");
	for (int i = 0; i < size; i++)
	{
		printf("%d ", *(A + i));
	}
	printf("}\n");
}
