#include <stdio.h>
#include <string.h>

typedef struct dictionary
{
	char name[20];
	char home[100];
	char phone[100];
}D;

int main()
{
	D s[3] = { 0 };
	char ans[10];

	for (int i = 0; i < 3; i++)
	{
		printf("이름: ");
		scanf("%s", s[i].name);
		printf("집전화번호:");
		scanf("%s", s[i].home);
		printf("휴대폰번호:");
		scanf("%s", s[i].phone);
	}
	printf("검색할 이릅을 입력하시오:");
	scanf("%s", &ans);

	for (int i = 0; i < 3; i++)
	{
		if (strcmp(ans, s[i].name) == 0)
		{
			printf("집전화번호: %s\n", s[i].home);
			printf("휴대폰번호: %s\n", s[i].phone);
		}
	}

	return 0;
}
