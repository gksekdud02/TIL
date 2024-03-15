#include <stdio.h>
#include <ctype.h>

int str_chr(char* s, int c);

int main()
{
	char S[100] = { 0 };
	char a;

	printf("문자열을 입력하시오: ");
	gets_s(S, 100);

	printf("개수를 셀 문자를 입력하시오:");
	scanf("%c", &a);

	printf("a의 개수:%d\n", str_chr(S,a));

	return 0;
}

int str_chr(char* s, int c)
{
	int count = 0;
	for (int i = 0; s[i] != NULL; i++)
	{
		if (s[i] == c)
			count++;
	}
	return count;	
}
      
