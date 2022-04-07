//Write a C program to find reverse of a string.
#include<stdio.h>
#include<string.h>
int main(){
 char s[100];
 char *p;
  printf("Enter a string...\n");
  gets(s);
  char rev[100];
  int l,i=0;
  l=strlen(s)-1;
  while(l>=0){
    rev[i++]=s[l--];
  } 
  rev[i]='\0';
 
 printf("After reversing the string : %s\n",rev);
return 0;
}
