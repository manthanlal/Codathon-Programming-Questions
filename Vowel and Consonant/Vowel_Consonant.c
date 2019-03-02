#include<stdio.h>
int main(int argc, char** argv)
{
    char *ptr;
    int countVowel, countConsonant;
    ptr = argv[1];
    countVowel = countConsonant = 0;
    while(*ptr != '\0')
    {
        if(*ptr=='A' ||*ptr=='E' ||*ptr=='I' ||*ptr=='O' ||*ptr=='U' ||*ptr=='a' ||*ptr=='e' ||*ptr=='i' ||*ptr=='o' ||*ptr=='u')
            countVowel++;
        else
            countConsonant++;
        ptr++;
    }
    printf("Vowel = %d and Consonant = %d\n", countVowel, countConsonant);
    return 0;
}
