#include <stdio.h>

int main()
{
	int arr[] = {1,1,2,2,3,3,4,4,5,5};
	
	int input, output;

	printf("상품 번호를 입력하시오:");
	scanf("%d", &input);

	for (int i = 0; i < 10; i++)
	{
		if (i + 1 == input)
			output = arr[i];
	}
	printf("상품 번호 %d의 위치는 %d입니다.\n", input, output);

	return 0;	
}
