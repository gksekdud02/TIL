#include <stdio.h>
#include <ctype.h>

int main()
{
	char S[100] = { 0 };
	int count = 0;

	printf("문자열을 입력하시오:");
	gets_s(S, 100);

	for (int i = 0; S[i] != NULL; i++)
	{
		if (ispunct(S[i]))
		{
			count++;
		}
	}
	printf("구두점의 개수는 %d입니다.\n", count);

	return 0;
}
