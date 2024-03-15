#include <stdio.h>

int check();

int main()
{
	check();
	check();
	check();
	check();
	
	return 0;
}

int check()
{
	static int count=0;

	count++;

	if (count > 3 )
	{
		printf("로그인 시도 횟수 초과\n");
		return 0;
	}
	
	printf("비밀번호: ");
	int n;
	scanf("%d", &n);


	if (n == 1234)
	{
		printf("로그인 성공\n");
		return 1;
	}

	return 0;
}
