#include <stdio.h>

typedef struct card
{
	int value;
	char suit;
}C;

int main()
{
	C poker[4][13];

	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 13; j++)
		{
			poker[i][j].value = j + 1;
		}
	}
	for (int j = 0; j < 13; j++)
	{
		poker[0][j].suit = 'c';
	}
	for (int j = 0; j < 13; j++)
	{
		poker[1][j].suit = 'd';
	}
	for (int j = 0; j < 13; j++)
	{
		poker[2][j].suit = 'h';
	}
	for (int j = 0; j < 13; j++)
	{
		poker[3][j].suit = 's';
	}
	
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 13; j++)
		{
			printf("%d:%c ", poker[i][j].value, poker[i][j].suit);
		}
	}
	return 0;
}
