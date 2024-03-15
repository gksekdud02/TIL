#include <stdio.h>
#include <string.h>

typedef struct student
{
    int number; //학번
    char name[20]; //이름
    int Kor; //국어
    int Eng; //영어
    int Mat; //수학
    double sum;
    double avg;
}S;

void add(S s[]);
void print(S s[]);
void search(S s[]);

int main()
{
    S s[3];
    int ans;

    while (1)
    {
        printf("===================\n");
        printf("1. 추가\n");
        printf("2. 출력\n");
        printf("3. 검색\n");
        printf("4. 종료\n");
        printf("===================\n");

        printf("입력:");
        scanf("%d", &ans);

        switch (ans)
        {
        case 1:
            add(s);
            break;
        case 2:
            print(s);
            break;
        case 3:
            search(s);
            break;
        case 4:
            exit();
        }
    }
    return 0;
}


void add(S s[])
{
    for (int i = 0; i < 3; i++)
    {
        printf("학번 : ");
        scanf("%d", &s[i].number);
        printf("이름 : ");
        scanf("%s", s[i].name);
        printf("국어 : ");
        scanf("%d", &s[i].Kor);
        printf("영어 : ");
        scanf("%d", &s[i].Eng);
        printf("수학 : ");
        scanf("%d", &s[i].Mat);
    }
}

void print(S s[])
{
    for (int i = 0; i < 3; i++)
    {
        s[i].sum = s[i].Kor + s[i].Eng + s[i].Mat;
        s[i].avg = s[i].sum / 3;

        printf("%d %s %d %d %d %lf %lf\n", s[i].number, s[i].name, s[i].Kor, s[i].Eng, s[i].Mat, s[i].sum, s[i].avg);
    }
}

void search(S s[])
{
    char ans;
    int result;
    int search_num;
    char search_name[10];

    printf("1: 학번, 2: 이름");
    printf("입력 :");
    scanf(" %c", &ans);
    if (ans == '1')
    {
        printf("학번 입력:");
        scanf("%d", &search_num);

        for (int i = 0; i < 3; i++)
        {
            if (search_num == s[i].number)
            {
                printf("%d %s %d %d %d %lf %lf\n", s[i].number, s[i].name, s[i].Kor, s[i].Eng, s[i].Mat, s[i].sum, s[i].avg);
            }
        }
    }
    else if (ans == '2')
    {
        printf("이름 입력:");
        scanf("%s", search_name);
        for (int i = 0; i < 3; i++)
        {
            result = strcmp(&s[i].name, search_name);
            if (result == 0)
            {
                printf("%d %s %d %d %d %lf %lf\n", s[i].number, s[i].name, s[i].Kor, s[i].Eng, s[i].Mat, s[i].sum, s[i].avg);
            }
        }
    }
}
