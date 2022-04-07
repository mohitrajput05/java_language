import java.util.Scanner;
class PrintMonth{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        short n;
        System.out.println("Enter the  number : ");
        n=scan.nextShort();
        if(n==1)
        System.out.println("31 Days");
        else if(n==2)
        System.out.println("28,29 Days");
        else if(n==3)
        System.out.println("31 Days");
        else if(n==4)
        System.out.println("30 Days");
        else if(n==5)
        System.out.println("31 Days");
        else if(n==6)
        System.out.println("30 Days");
        else if(n==7)
        System.out.println("31 Days");
        else if(n==8)
        System.out.println("31 Days");
        else if(n==9)
        System.out.println("30 Days");
        else if(n==10)
        System.out.println("31 Days");
        else if(n==11)
        System.out.println("30 Days");
        else if(n==12)
        System.out.println("31 Days");
        else
        System.out.println("Invalid Choice Please Re-Enter the Number ");        
    }
}