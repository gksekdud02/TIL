#include "main.h"
#include <stdlib.h>

int main()
{
	FILE* fp;
	int select;
	extern S data;

	if ((fp = fopen("student.dat", "a+")) == NULL)
	{
		fprintf(stderr, "입력을위한 파일을 열 수 없습니다.");
		exit(1);
	}

	while (1)
	{
		menu();
		printf("번호를 입력하시오:");
		scanf("%d", &select);

		switch (select)
		{
		case 1:
			add(fp);
			break;
		case 2:
			print_all(fp);
			break;
		case 3:
			search(fp);
			break;
		case 4:
			return 0;
		}
	}
	fclose(fp);

	return 0;
}
