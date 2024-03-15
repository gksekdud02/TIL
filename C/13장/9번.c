#include <stdio.h>
#include <stdlib.h>

typedef struct food {
	char name[100];
	int calories;
}FOOD;

int main()
{
	FOOD f_array[3];
	char op;
	int i = 0;
	int count = 0;
	int result = 0;

	while (1)
	{
		printf("음식 정보를 저장하시겠습니까?(y/n)");
		scanf(" %c", &op);
		if (op == 'n')
			break;
		printf("음식 이름:");
		scanf(" %s", f_array[i].name);
		printf("칼로리");
		scanf(" %d", &f_array[i].calories);
		i++;
		count++;
		printf("\n");
	}

	for (int i = 0; i < count; i++)
	{
		result += f_array[i].calories;
	}

	printf("총칼로리=%d\n", result);
	return 0;
}
