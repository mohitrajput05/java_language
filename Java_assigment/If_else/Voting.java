import java.util.Scanner;
class Voting{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        short a;
        System.out.println("Enter the  age : ");
        a=scan.nextShort();
        if(a >= 18 && a <= 60)
        System.out.println("You are eligible for voting ");
        else
        System.out.println("You are not eligible for voting ");
    }
}