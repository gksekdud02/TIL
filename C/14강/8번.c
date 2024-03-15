#include <stdio.h>
#define WIDTH 3
#define HEIGHT 3

void array_copy(int src[][WIDTH], int dst[][WIDTH]);

int main()
{
	int src[][WIDTH] = { {100,30,67},{89,50,120},{19,60,90} };
	int dst[HEIGHT][WIDTH];

	for (int i = 0; i < HEIGHT; i++)
	{
		for (int j = 0; j < WIDTH; j++)
		{
			printf("%d ", src[i][j]);
		}
		printf("\n");
	}
	printf("\n");
	array_copy(src, dst);

	return 0;
}

void array_copy(int src[][WIDTH], int dst[][WIDTH])
{
	int* p = &src[0][0];
	int* end = &src[HEIGHT - 1][WIDTH - 1];
	int* q = &dst[0][0];

	while (p <= end)
	{
		*q++ = *p++;
	}

	for (int i = 0; i < HEIGHT; i++)
	{
		for (int j = 0; j < WIDTH; j++)
		{
			printf("%d ", dst[i][j]);
		}
		printf("\n");
	}
}
