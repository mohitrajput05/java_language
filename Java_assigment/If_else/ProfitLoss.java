import java.util.Scanner;
class ProfitLoss{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        short cp,sp,result;
        System.out.println("Enter Cost Price ");
        cp=scan.nextShort();
        System.out.println("Enter Selling Price ");
        sp=scan.nextShort();
        result=(short)(cp - sp);
        if(cp>sp)
        System.out.println("Loss");
        else 
        System.out.println("Proit");
    }
}