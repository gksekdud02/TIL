#include "main.h"

void print_all(FILE* fp)
{
	S data;

	fseek(fp, 0, SEEK_SET);

	while (1)
	{
		fread(&data, sizeof(data), 1, fp);
		{
			if (feof(fp))
				break;
			print(data);
		}
	}
}
