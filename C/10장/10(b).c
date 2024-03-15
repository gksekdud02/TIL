#include <stdio.h>

double vector_dot_prod(double x[], double y[]);

int main()
{
	double x[3] = { 1,2,3 };
	double y[3] = { 1,2,3 };
	
	double dot_prod;

	dot_prod = vector_dot_prod(x, y);

	printf("벡터의 내적=%lf\n", dot_prod);

	return 0;
}

double vector_dot_prod(double x[], double y[])
{
	double z = 0;
	for (int i = 0; i < 3; i++)
	{
		z += x[i] * y[i];
	}
	return z;
}
