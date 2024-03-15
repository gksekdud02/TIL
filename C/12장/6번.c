#include <stdio.h>
#include <ctype.h>

void str_upper(char* s);

int main()
{
	char S[100] = { 0 };
	
	printf("문자열을 입력하시오:");
	gets_s(S, 100);

	printf("변환된 문자열 :");
	str_upper(S);

	printf("\n");

	return 0;
}

void str_upper(char* s)
{
	for (int i = 0; s[i] != NULL; i++)
	{
		*(s + i) = toupper(*(s+i));
		printf("%c", *(s + i));
	}
}
