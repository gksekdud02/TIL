#include<stdio.h>
#include<stdlib.h>
#define SIZE 100
int main()
{
	int a[SIZE];
	int count[10] = { 0 };
	int max, num;
	
	for (int i = 0; i < SIZE; i++)\
	{
		a[i] = rand() % 10;
		count[a[i]]++;
	}
	max = count[0];

	for (int i = 1; i < 10; i++)
	{
		if (count[i] > max) 
		{
			max = count[i];
			num = i;
		}
	}
	printf("가장 많이 나온 수=%d",num);
}
