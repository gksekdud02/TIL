#include <stdio.h>

set_proverb(char** q, int n);

int main()
{
	int ans;
	char* p=NULL;
	
	printf("몇번째 속담을 선택하시겠습니까?");
	scanf("%d", &ans);

	set_proverb(&p, ans-1);
	
	printf("selected proverb = %s\n",p);
}

set_proverb(char** q, int n)
{
	static char* array[10] =
	{
		"A bad chearer never had a good sickle.",
		"A bad workman (always) blames his tools.",
		"A bad workman quarrels with his tools.",
		"A bad thing never dies.",
		"Love begets love.",
		"Lovers are fools.",
		"Pride will have a fall.",
		"Empty vessels make the most sound.",
		"Office changes manners.",
		"Power is dangerous unless you have humility."
	};
	*q = array[n];
}
