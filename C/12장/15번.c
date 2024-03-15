#include <stdio.h>
#include <string.h>

int main()
{
	char S[100] = { 0 };
	int x, y;
	char add[] = "add";
	char sub[] = "sub";
	char mul[] = "mul";
	char div[] = "div";
	int result = 0;

	printf("연산을 입력하시오:");
	scanf("%s %d %d",S, &x, &y);

	if (strcmp(S, add) == 0)
		result = x + y;
	else if (strcmp(S, sub) == 0)
		result = x + (-y);
	else if (strcmp(S, mul) == 0)
		result = x * y;
	else if (strcmp(S, div) == 0)
		result = x / y;

	printf("연산결과:%d\n", result);
}
