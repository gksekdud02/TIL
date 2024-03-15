#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
	char S[100] = { 0 };
	char* token;
	char seps[] = " ";
	char str[100][100]= { 0 };

	printf("성과 이름을 대문자로 입력하시오:");
	gets_s(S, 100);

	for (int i = 0; S[i] != NULL; i++)
	{
		if (isupper(S[i]))
			S[i] = tolower(S[i]);
	}

	token = strtok(S, seps);

	for (int i = 0; token != NULL; i++)
	{
		strcpy(str[i], token);
		token = strtok(NULL, seps);
	}
	
	printf("%s, %s ",str[1],str[0]);

	return 0;
}
