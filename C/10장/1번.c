#include <stdio.h>

int main()
{
	int day[] = { 31,29,31,30,31,30,31,31,30,31,30,31 };


	for (int i = 7; i <= 11; i++)
	{
		printf("%d월은 %d까지 있습니다.\n", i + 1, day[i]);
	}
	return 0;
}
