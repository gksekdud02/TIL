#include <stdio.h>
#include <string.h>

typedef struct email
{
	char title[100];
	char sender[100];
	char receiver[100];
	char content[100];
	char date[100];
	int pri;
}E;

int main()
{
	E s;
	strcpy(s.title, "안부 메일");
	strcpy(s.sender, "chulsoo@hankuk.ac.kr");
	strcpy(s.receiver, "hsh@hankuk.ac.kr");
	strcpy(s.content, "안녕하십니까? 별 일 없으신지요?");
	strcpy(s.date, "2019/9/1");
	s.pri = 1;

	printf("제목 : %s\n", s.title);
	printf("수신자 : %s\n", s.sender);
	printf("발신자 : %s\n", s.receiver);
	printf("내용 : %s\n", s.content);
	printf("날짜 : %s\n", s.date);
	printf("우선순위 : %d\n", s.pri);

	return 0;
}
