#include <stdio.h>

void get_sum_diff(int x, int y, int* p_sum, int* p_diff);

int main()
{
	int x=100, y=200;
	int sum, diff;

	get_sum_diff(x,y, &sum, &diff);

	printf("원소들의 합=%d\n", sum);
	printf("원소들의 차=%d\n", diff);

	return 0;
}

void get_sum_diff(int x, int y, int* p_sum, int* p_diff)
{
	*p_sum = x + y;
	*p_diff = x - y;
}

/*
int main()
{
	int x=100, y=200;
	int sum, diff;

	int* p_sum = &sum;
	int* p_diff = &diff;

	get_sum_diff(x,y, p_sum, p_diff);

	printf("원소들의 합=%d\n", sum);
	printf("원소들의 차=%d\n", diff);

	return 0;
}
*/
