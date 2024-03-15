#include <stdio.h>
#define PI 3.14

typedef struct point
{
	int x, y;
}P;

typedef struct circle
{
	P center; //원의 중심
	double radius;  //원의 반지름
}C;

double area(C c);
double perimeter(C c);

int main()
{
	C c;

	printf("원의 중심점:");
	scanf("%d %d", &c.center.x, &c.center.y);

	printf("원의 반지름:");
	scanf("%lf", &c.radius);

	printf("원의 면적=%lf, 원의 둘레=%lf\n", area(c),perimeter(c));

	return 0;
}

double area(C c)
{
	return PI * c.radius;
}

double perimeter(C c) 
{
	return 2 * PI * c.radius;
}
