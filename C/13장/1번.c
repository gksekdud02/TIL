#include <stdio.h>
#include <string.h>

struct book
{
	int id;
	char title[100];
	char author[20];
};

int main()
{
	struct book s;
	s.id = 1;
	strcpy(s.title, "바람과 함께 사라지다");
	strcpy(s.author, "마가렛 미첼");

	printf("{ %d, %s, %s }\n", s.id, s.title, s.author);

	return 0;
}
