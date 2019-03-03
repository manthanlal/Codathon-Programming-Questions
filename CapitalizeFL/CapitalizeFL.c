#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(int argc, char** argv)
{
	char *ptr;
	ptr = argv[1];
	
	int length = strlen(ptr);
	if(ptr[0] >= 97)
		ptr[0] = ptr[0] - 32;
	if(ptr[length-1] >= 97)
		ptr[length-1] = ptr[length-1] - 32;
	
	printf("%s\n", ptr);
	return 0;	
}
