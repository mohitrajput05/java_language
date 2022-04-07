import java.util.Scanner;
class Alphabetnot{
    public static void main(String args[]){
        Scanner mohit = new Scanner(System.in);
        char value;
        System.out.println("Enter the value for checking ");
        value=mohit.next().charAt(0);
        if(value>='a'&&value<='z'||value>='A'&&value<='Z')
        System.out.printf("%c  is a alphabet",value);
        else if(value>=48&&value<=57)
        System.out.printf("%c is digit ",value);
        else 
        System.out.printf("%c is special character ",value);
    }
}