import java.util.Scanner;
class Negativeposs{
    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        byte a;
        System.out.println("Enter the value of a :");
        a=scan.nextByte();
        if(a<0)
        System.out.println("Number is Negative ");
        else if(a>0)
        System.out.println("Number is positive");
        else
        System.out.println("Number is zero");
    }
}