#include <stdio.h>
char check_alpha(char);

int main()
{
	char ch;

	printf("문자를 입력하시오:");
	scanf("%c", &ch);

	check_alpha(ch);

	return 0;
}

char check_alpha(char ch)
{
	if ('a' <= ch && ch <= 'z')
	{
		printf("%c는 알파벳 문자입니다.\n",ch);
	}
}
