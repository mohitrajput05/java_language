//Write a C program to search all occurrences of a character in given string.
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
  			Flag=i;
		printf("The Occurence of the Search Element %c is at Position %d\n", ch, Flag + 1);  

		}
 		i++;
	}
        if(Flag == 0)
  		printf("Sorry not found Character %c \n", ch);
 return 0;
}
