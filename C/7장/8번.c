#include <stdio.h>

int main()
{
	int i, j,num;

	for (i = 1; i <= 50; i++)
	{
		printf("막대의 높이(종료:-1):");
		scanf("%d", &num);

		for (j = 1; j <= num; j++)
		{
			printf("*");
		}
		printf("\n");
		if (num == -1)
			break;
	}
	return 0;
}
