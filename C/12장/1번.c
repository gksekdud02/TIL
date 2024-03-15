#include <stdio.h>
#include <ctype.h>

int main()
{
	char a;

	printf("문자를 입력하시오:");
	scanf("%c", &a);
	
	printf("아스키 코드값:%d", a);

	return 0;
}
