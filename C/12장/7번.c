#include <stdio.h>
#include <string.h>
#include <ctype.h>

int get_response(char* prompt);

int main()
{
	char S[10];
	
	printf("게임을 하시겠습니까? ");
	gets_s(S, 10);

	for (int i = 0; S[i] != NULL; i++)
	{
		if (isupper(S[i]))
			S[i] = tolower(S[i]);
	}

	if (get_response(S) == 1)
	{
		printf("긍정적인 답변\n");
	}
	else if(get_response(S) == 0)
	{
		printf("부정적인 답변\n");
	}

	return 0;
}

int get_response(char* prompt)
{
	char s1[] = "yes";
	char s2[] = "ok";
	char s3[] = "no";

	if (strcmp(prompt, s1)==0)
	{
		return 1;
	}
	else if (strcmp(prompt, s2)==0)
	{
		return 1;
	}
	else if (strcmp(prompt, s3)==0)
	{
		return 0;
	}
	return -1;
}
