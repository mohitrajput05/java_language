import java.util.Scanner;
class Evenodd{
    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        int a;
        System.out.println("Enter the number ");
        a=scan.nextByte();
        if(a % 2 == 0)
        System.out.println("Number is Even"); 
        else       
        System.out.printf("Number is Odd ");
    }
}