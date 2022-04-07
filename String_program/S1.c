//Write a C program to find length of a string.
#include<stdio.h>
#include <string.h>
int length(char []);
int main(){
  char str[100];
    int len;

    printf("\n Please Enter any String :  ");
    gets(str);

    len = strlen(str);
    printf("Length of the string : %d\n",len);
    
     int x= length(str);
    printf("Length of the string by user define function : %d\n",x);
 return 0;
}
int length(char str[]){
  int i=0;
   while(str[i]!='\0'){
   i++;
   }
  return i;
}
