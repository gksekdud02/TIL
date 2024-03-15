#include <stdio.h>
#include <string.h>

int main()
{
	char S[100];
	char seps[] = " ";
	char* token;
	int count = 0;

	printf("문자열을 입력하시오:");
	gets_s(S, 100);

	token = strtok(S, seps);

	while (token != NULL)
	{
		count++;
		token = strtok(NULL, seps);
		
	}
	printf("단어의 개수:%d\n", count);

	return 0;
}
