#include<errno.h>
#include<limits.h>
#include<stdlib.h>
int main(int argc, char** argv)
{
    char *p;
    int num;
    errno = 0;
    long conv = strtol(argv[1], &p, 10);
    if (errno != 0 || *p != '\0' || conv > INT_MAX)
    {
        printf("Input error!");
    }
    else {
        num = conv;
        int digit = num%10;
        num = num/10;
        digit = num%10;
        if(digit == 2 || digit == 3 || digit == 5 || digit == 7)
            printf("prime");
        else
            printf("not prime");
    }
}
