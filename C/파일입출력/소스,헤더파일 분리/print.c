#include "main.h"

void print(S data)
{
	printf("이름: %s\n", data.name);
	printf("영어: %d\n", data.Eng);
	printf("국어: %d\n", data.Kor);
	printf("수학: %d\n", data.Mat);
	printf("평균: %lf\n", data.avg);
}
