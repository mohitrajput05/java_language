//Write a C program to check whether a string is palindrome or not.
#include <stdio.h>
#include <string.h>
int main(){
    char str[100];
    int len,i,flag = 0;
    printf("\n Please Enter any String :  ");
    gets(str);

    len = strlen(str);
   for (int i = 0; i < len; i++){
        if (str[i] != str[len - i - 1]){
            flag = 1;
            break;
        }
    }
    if (flag == 0)
        printf("\n %s is a Palindrome String\n", str);
    else
        printf("\n %s is Not a Palindrome String\n", str);

    
    return 0;
}
