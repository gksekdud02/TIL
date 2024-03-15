#include <stdio.h>

typedef struct point
{
	int x;
	int y;
}P;

int quadrant(P *p);

int main()
{
	P p;

	printf("좌표를 입력하시오:");
	scanf("%d %d", &p.x, &p.y);

	printf("(%d, %d)의 사분면=%d\n", p.x, p.y, quadrant(&p));

	return 0;
}

int quadrant(P *p)
{
	if (p->x > 0 && p->y > 0)
		return 1;
	if (p->x > 0 && p->y < 0)
		return 4;
	if (p->x < 0 && p->y > 0)
		return 2;
	if (p->x < 0 && p->y < 0)
		return 3;

	return 0;
}
