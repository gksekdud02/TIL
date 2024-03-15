#ifndef __STUDENT_H__
#define __STUDENT_H__
#include <stdio.h>
#define SIZE 100

typedef struct student
{
	char name[SIZE];
	int Mat;
	int Kor;
	int Eng;
	double avg;
}S;

S get_record();
void print(S data);

#endif 
