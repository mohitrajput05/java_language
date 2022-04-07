import java.util.Scanner;
class Divide5_11{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        short n;
        System.out.println("Enter the  number : ");
        n=scan.nextShort();
        if(n%5==0)
        System.out.println(n+" is divisible by 5 ");
        else
        System.out.println(n+" is not divisible by 5");
        if(n%11==0)
        System.out.println(n+" is divisible by 11");
        else
        System.out.println(n+" is not divisible by 11");
    }
}