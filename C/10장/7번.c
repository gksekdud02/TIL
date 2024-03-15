#include <stdio.h>

int main()
{
	int arr[10][3];
	int input, find;

	for (int i = 0; i < 10; i++)
	{
		arr[i][0] = i + 1;
		for (int j = 1; j < 3; j++)
		{
			arr[i][j] = arr[i][j - 1];
			arr[i][j] *= arr[i][0];
		}
	}

	printf("정수를 입력하시오:");
	scanf("%d", &input);

	for (int i = 0; i < 10; i++)
	{
		if (arr[i][2] == input)
			find = i + 1;
	}
	printf("%d의 세제곱근은 %d\n", input, find);
}
