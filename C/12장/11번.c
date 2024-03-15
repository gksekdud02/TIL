#include <stdio.h>
#include <string.h>

int main()
{
	char S[100] = { 0 };
	char seps[] = " ";
	char* token;
	char str[100][100] = { 0 };
	int count = 0;

	printf("문자열을 입력하시오: ");
	gets_s(S, 100);

	token = strtok(S, seps);

	for (int i = 0; token != NULL; i++)
	{
		count++;
		strcpy(str[i], token);
		token = strtok(NULL, seps);
	}
	for (int i = count; i >= 0; i--)
	{
		printf("%s ", str[i]);
	}
	return 0;
}
