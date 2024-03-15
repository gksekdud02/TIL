#include "main.h"

void add(FILE* fp)
{
	S data;
	data = get_record();
	fseek(fp, 0, SEEK_END);
	fwrite(&data, sizeof(data), 1, fp);
}
