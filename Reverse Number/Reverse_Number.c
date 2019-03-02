#include<stdio.h>
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
        int digit, rev = 0;
        while(num != 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        printf("%d\n", rev);
    }
}
