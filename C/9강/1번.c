#include <stdio.h>

int add(int, int);
int sub(int, int);
int mul(int, int);
int div(int, int);

int main()
{
	int x, y;
	char op;

	while (1)
	{
		printf("연산을 입력하시오:");
		scanf("%d %c %d", &x, &op, &y);

		if (op == '+')
		{
			printf("연산결과:%d\n", add(x, y));
		}
		else if (op == '-')
		{
			printf("연산결과:%d\n", sub(x, y));
		}
		else if (op == '*')
		{
			printf("연산결과:%d\n", mul(x, y));
		}
		else if (op == '/')
		{
			printf("연산결과:%d\n", div(x, y));
		}
		else
			printf("지원되지 않는 연산자 입니다.\n");
	
	}
	return 0;
}

int add(int x, int y)
{
	static int count;
	count++;
	printf("덧셈은 총 %d번 실행되었습니다.\n",count);
	return x + y;
}

int sub(int x, int y)
{
	static int count;
	count++;
	printf("뺄셈은 총 %d번 실행되었습니다.\n",count);
	return x - y;
}

int mul(int x, int y)
{
	static int count;
	count++;
	printf("곱셈은 총 %d번 실행되었습니다.\n", count);
	return x * y;
}

int div(int x, int y)
{
	static int count;
	count++;
	printf("나눗셈은 총 %d번 실행되었습니다.\n", count);
	return x / y;
}
