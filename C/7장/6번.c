#include <stdio.h>

int main()
{
	char op;
	int x, y;

	printf("*****************\n");
	printf("A----Add\n");
	printf("S----Sub\n");
	printf("M----Multi\n");
	printf("D----Did\n");
	printf("Q----Quit\n");
	printf("*****************\n");

	do
	{
		printf("연산을 선택하시오 :");
		scanf("\n%c", &op);

		if (op == 'Q')
			break;

		printf("두수를 공백으로 분리하여 입력하시오:");
		scanf("%d %d", &x, &y);

		if (op == 'A')
			printf("%d\n", x + y);
		if (op == 'S')
			printf("%d\n", x - y);
		if (op == 'M')
			printf("%d\n", x * y);
		if (op == 'D')
			printf("%d\n", x / y);

	} while (1);

	return 0;
}
