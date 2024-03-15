#include <stdio.h>
#include <string.h>

typedef struct account
{
	int number;
	char name[20];
	int balance;
}A;

int main()
{
	A s;
	s.number = 1;
	strcpy(s.name, "홍길동");
	s.balance = 100000;

	printf("{ %d, %s, %d }\n", s.number, s.name, s.balance);

	return 0;
}
