//Write a C program to compare two strings.
#include <stdio.h>
#include <string.h>
int main(){
    int x;
    char str1[100],str2[100];

    printf("\n Please Enter 1st String : ");
    gets(str1);
     printf("\n Please Enter second String : ");
    gets(str2);
    x=strcmp(str1,str2);
    if(x==0) 
       printf("%s equals to %s\n",str1,str2);
    else if(x>0)
           printf("%s greater then %s\n",str1,str2);
         else
              printf("%s less then %s\n",str1,str2);  
 return 0;
}
