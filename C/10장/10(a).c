#include <stdio.h>

double vector_add(double x[], double y[], double z[]);

int main()
{
	double x[3] = { 1,2,3 };
	double y[3] = { 1,2,3 };
	double z[3] = { 0 };

	vector_add(x, y, z);

	printf("벡터의 합=");

	for (int i = 0; i < 3; i++)
	{
		printf("%lf ", z[i]);
	}

}

double vector_add(double x[], double y[], double z[])
{
	for (int i = 0; i < 3; i++)
	{
		z[i] = (x[i] + y[i]);
	}
	return z[3];
}
