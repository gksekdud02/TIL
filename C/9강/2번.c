#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int get_dice_face();

int main()
{
	int x=0;
	srand((unsigned)time(NULL));
    
	get_dice_face(x);

	return 0;
}

int get_dice_face(int x)
{
	static int count1 = 0;
	static int count2 = 0;
	static int count3 = 0;
	static int count4 = 0;
	static int count5 = 0;
	static int count6 = 0;

	for (int i = 1; i <= 100; i++)
	{
		x = rand() % 6 + 1;

		if (x == 1)
			count1++;
		if (x == 2)
			count2++;
		if (x == 3)
			count3++;
		if (x == 4)
			count4++;
		if (x == 5)
			count5++;
		if (x == 6)
			count6++;
		if (i % 100 == 0)
			printf("%d\n%d\n%d\n%d\n%d\n%d\n", count1, count2, count3, count4, count5, count6);
	}
	return x;
}
