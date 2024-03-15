#include <stdio.h>
#include <string.h>

void pr_str_array(char** dp,int size);

int main()
{
	char* p[5] =
	{
		"A bad shearer never had a good sickle"
		,"A bad workman (always) blames his tools"
		,"A bad workman quarrels with his tools"
		,"A bad thing never dies"
		,"A bad workman finds fault with his tools"
	};

	pr_str_array(p,5);

	return 0;
}

void pr_str_array(char** dp,int size)
{
	for (int i = 0; i < size; i++)
	{
		printf("%s\n", *(dp + i));
	}
}
