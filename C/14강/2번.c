#include <stdio.h>

int get_sum(int a[], int size);

int main()
{
	int a[3][6];
	int result = 0;

	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 6; j++)
		{
			a[i][j] = 10;
		}
	}

	for (int i = 0; i < 3; i++)
	{
		result += get_sum(a[i], 6);
	}
	
	printf("정수의 합 %d", result);

	return 0;
}

int get_sum(int a[], int size)
{
	int result=0;

	for (int i = 0; i < size; i++)
	{
		result += a[i];
	}
	
	return result;
}
