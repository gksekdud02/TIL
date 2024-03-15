#include <stdio.h>
int is_year(int year);

int main()
{
	int year;

	printf("연도를 입력하시오:");
	scanf("%d", &year);

	is_year(year);

	return 0;
}

int is_year(int year)
{
	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
	{
		printf("%d년은 366일입니다.\n", year);
	}
	else
		printf("%d년은 365일입니다.\n", year);

	return 0;
}
