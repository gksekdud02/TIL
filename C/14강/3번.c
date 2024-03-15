#include <stdio.h>

double get_avg(int a[], int n);

int main() 
{
	int score[3][2] = { {60,50},{80,10},{50,45} };
	int result = 0;

	for (int i = 0; i < 3; i++)
	{
		printf("%d행의 평균값 = %lf\n", i, get_avg(score[i], 2));
	}

	return 0;
}

double get_avg(int a[], int n)
{
	int result = 0;
	
	for (int i = 0; i < n; i++)
	{
		result += a[i];
	}

	return (result / n);
}
