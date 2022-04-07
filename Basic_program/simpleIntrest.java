import java.util.Scanner;
class simpleIntrest{
    public static void main(String mohit[]){
        int p,r,t;
        float si;
        Scanner scan  = new Scanner(System.in);
        System.out.printf("Enter the Principal :");
        p=scan.nextInt();
        System.out.printf("Enter the Rate :");
        r=scan.nextInt();
        System.out.printf("Enter the Time :");
        t=scan.nextInt();
        si=(p*r*t)/100f;
        System.out.println("Simple intrest of p*r*t :"+si);
    }
}