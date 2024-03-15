#include <stdio.h>

void printfoptions();
int add(int x, int y);
int subtract(int x, int y);
int multiply(int x, int y);
int divide(int x, int y);
int mod(int x, int y);

int main()
{
	int a, b, result=0;
	char m,n;

	while (1)
	{
		printfoptions();

		printf("원하는 메뉴를 선택하시오(1-5):");
		scanf("%c", &m);

		printf("숫자 2개를 입력하시오:");
		scanf("%d %d", &a, &b);

		switch (m)
		{
		case'1':
			result = add(a, b);
			break;
		case'2':
			result = subtract(a, b);
			break;
		case'3':
			result = multiply(a, b);
			break;
		case'4':
			result = divide(a, b);
			break;
		case'5':
			result = mod(a, b);
			break;
		}
		printf("연산결과:%d\n", result);

		printf("계속하려면 y를 누르시오:");
		scanf(" %c", &n);

		if (n == 'y')
			break;


		printf("\n");
	}
	return 0;
}

void printfoptions()
{
	printf("================================\n");
	printf("MENU\n");
	printf("================================\n");
	printf("1.덧셈\n");
	printf("2.뺄셈\n");
	printf("3.곱셈\n");	
	printf("4.나눗셈\n");
	printf("5.나머지\n");

	return;
}

int add(int x, int y)
{
	return x + y;
}

int subtract(int x, int y)
{
	return x - y;
}

int multiply(int x, int y)
{
	return x * y;
}

int divide(int x, int y)
{
	return x / y;
}

int mod(int x, int y)
{
	return x % y;
}
