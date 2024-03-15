#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
	srand((unsigned)time(NULL));

	int x[10] = { 0 };
	int min, max;

	for (int i = 0; i <= 9; i++)
	{
		x[i] = rand();
	}

	min = x[0];
	max = x[0];

	for (int j = 1; j <= 9; j++)
	{
		if (x[j] < min)
		{
			min = x[j];
		}
		if (x[j] > max)
		{
			max = x[j];
		}
	}
	printf("최대값은 %d\n", max);
	printf("최소값은 %d\n", min);

	return 0;
}
