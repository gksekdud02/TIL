#include "main.h"

S get_record()
{
	S data;
	getchar();
	printf("이름 :");
	gets_s(data.name, SIZE);
	printf("수학 :");
	scanf("%d", &data.Mat);
	printf("영어 :");
	scanf("%d", &data.Eng);
	printf("국어 :");
	scanf("%d", &data.Kor);
	data.avg = ((double)data.Eng + (double)data.Mat + (double)data.Kor) / 3.0;

	return data;
}
