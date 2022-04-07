//Write a C program to count occurrences of a character in given string.
#include <stdio.h>
#include <string.h>
int main(){
     	char str[100], ch;
  	int i=0, Flag=0;
 
  	printf("\n Please Enter any String :  ");
  	gets(str);
  	
  	printf("\nEnter the Character that you want to check occurence:  \n");
  	scanf("%c", &ch);  	
  	while(str[i] != '\0'){
  		if(str[i] == ch){  
  			Flag++;
		}
 		i++;
	}
        if(Flag == 0)
  		printf("Sorry not found Character %c \n", ch);
	else
		printf("The count Occurence of the Search Element %c is  %d\n", ch, Flag);  
 return 0;
}
