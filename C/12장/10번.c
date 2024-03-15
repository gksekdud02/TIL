#include<stdio.h>
#include<string.h>
#include<ctype.h>

int check(char* str);

int main() 
{
	char str[100] = { 0 };

	printf("문자열을 입력하시오 : ");
	gets_s(str,100);				
	if (check(str) == 1)
		printf("회문입니다.");
	else
		printf("회문이 아닙니다.");
}

int check(char* str)
{
	for (int i = 0; str[i] != NULL; i++) 
	{			
		if (isupper(str[i]))
			str[i] = tolower(str[i]);
	}

	for (int i = 0; i < strlen(str); i++)
	{
		if (str[i] == str[strlen(str) - i-1])																																		//	str[strlen(str) - i - 1]은 끝부터 하나씩 감소(str[strlen(str) - 1]이 맨 마지막이니까 - i 를 추가한다.) *************
			continue;				
		else
			return 0;				
	}
	return 1;							
}
