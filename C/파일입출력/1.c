#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define SIZE 100

typedef struct student
{
	char name[SIZE];
	int Mat;
	int Kor;
	int Eng;
	double avg;
}S;

void menu();
void add(FILE* fp);
void print(S data);
void print_all(FILE* fp);
void search(FILE* fp);
S get_record();

int main()
{
	FILE* fp;
	int select;
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

void menu()
{
	printf("==============\n");
	printf("1.추가\n");
	printf("2.출력\n");
	printf("3.검색\n");
	printf("4.종료\n");
	printf("==============\n");
}

void add(FILE* fp)
{
	S data;
	data = get_record();
	fseek(fp, 0, SEEK_END);
	fwrite(&data, sizeof(data), 1, fp);
}

void print(S data)
{
	printf("이름: %s\n", data.name);
	printf("영어: %d\n", data.Eng);
	printf("국어: %d\n", data.Kor);
	printf("수학: %d\n", data.Mat);
	printf("평균: %lf\n", data.avg);
}

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
