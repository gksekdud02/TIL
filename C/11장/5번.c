#include <stdio.h>

void convert(double* grades, double* scores, int size);

int main()
{
	double grades[10] = { 00.00,00.50,01.00,01.50,02.00,02.50,03.00,03.50,04.00,04.30};
	double scores[10] = { 0 };

	for (int i = 0; i < 10; i++) 
	{
		printf("%05.2lf ", grades[i]); 
	}
	printf("\n");
	convert(grades, scores, 10);

	for (int i = 0; i < 10; i++)
	{
		printf("%05.2lf ", scores[i]);
	}
	printf("\n");
	return 0;
}

void convert(double* grades, double* scores, int size)
{
	for (int i = 0; i < size; i++)
	{
		*(scores+i) = (100 * *(grades+i))/4.3;
	}
}
