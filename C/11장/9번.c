#include <stdio.h>

int search(int* A, int size, int search_value);

int main()
{
	int A[5] = { 100,200,300,400,500 };

	printf("월급이 200만원인 사람의 인덱스 = %d\n", search(A, 5, 200));

	return 0;
}

int search(int* A, int size, int search_value)
{
	for (int i = 0; i < size; i++)
	{
		if (*(A + i) == search_value)
		{
			return i;
		}
	}
	return 0;
}
