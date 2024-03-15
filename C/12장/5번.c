#include <stdio.h>
#include <ctype.h>

int main()
{
	int c;
	
	printf("문자를 입력하시오:");
	scanf("%d", &c);

	while ((c = getchar()) != '.')
	{
		if (islower(c))
		{
			c = toupper(c);
			putchar(c);
		}
		else if (isupper(c))
		{
			c = tolower(c);
			putchar(c);
		}
		else
			printf("영어 알파벳의 범위를 벗어남");
		printf("\n");

		printf("문자를 입력하시오:");
		scanf("%d", &c);
	}
	return 0;
}
