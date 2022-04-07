import java.util.Scanner;
class FactorialNum{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int num ,i=1,fact=1;
        System.out.println("Enter the number ");
        num=scan.nextInt();
        while(i<=num){
        fact=fact*i;
        i++;
        }
        System.out.printf("%d : %d",num,fact);
    }
}