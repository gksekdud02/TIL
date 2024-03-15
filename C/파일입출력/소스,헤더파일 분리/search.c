#include "main.h"

void search(FILE* fp)
{
	char name[SIZE];
	S data;

	fseek(fp, 0, SEEK_SET);
	getchar();
	printf("탐색하려는 사람의 이름:");
	gets_s(name, SIZE);

	while (!feof(fp))
	{
		fread(&data, sizeof(data), 1, fp);
		if (strcmp(data.name, name) == 0)
		{
			print(data);
			break;
		}
	}
}
