#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
	char S[100] = { 0 };
	char a[] = ".";

	printf("텍스트를 입력하시오:");
	gets_s(S, 100);

	if (islower(S[0]))
	{
		S[0] = toupper(S[0]);
	}
	
	if (S[strlen(S) - 1] != a)
	{
		strcat(S, a);
	}

	printf("수정된 텍스트 :");
	puts(S);

	return 0;
}
