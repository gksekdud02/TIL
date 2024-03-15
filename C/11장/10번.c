#include <stdio.h>

void get_lcm_gcd(int x, int y, int* p_lcm, int* p_gcd);

int main()
{
	int x, y;
	int lcm, gcd;
	int* p_lcm = &lcm, * p_gcd = &gcd;

	printf("두개의 정수를 입력하시오: ");
	scanf("%d %d", &x, &y);


	get_lcm_gcd(x, y, p_lcm, p_gcd);

	printf("최소공배수 = %d\n", lcm);
	printf("최대공약수 = %d\n", gcd);

	return 0;
}

void get_lcm_gcd(int x, int y, int* p_lcm, int* p_gcd)
{
	int r, mul = x * y;
	while (y != 0)
	{		             //최대공약수를 찾는 방법(유클리드 알고리즘 OR 최대공약수 알고리즘)
		r = x % y;
		x = y;
		y = r;
	}
	*p_gcd = x;
	*p_lcm = mul / (*p_gcd);
}
