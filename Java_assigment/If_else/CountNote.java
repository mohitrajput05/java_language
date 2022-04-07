import java.util.Scanner;
class CountNote{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int amount;
        int r2000,r500,r200,r100,r50,r20,r10,count;
        r2000=r500=r200=r100=r50=r20=r10=count=0;
        System.out.println("Enter the amount ");
        amount=scan.nextInt();
        if(amount>=2000)
        {
            r2000=amount/2000;
            amount = amount%2000;
            System.out.println("Total Number Of 2000 Rupees Notes Or coin : " +r2000);
        }
        if(amount>=500)
        {
            r500=amount/500;
            amount = amount%500;
            System.out.println("Total Number Of 500 Rupees Notes Or coin : " +r500);
        }
        if(amount>=200)
        {
            r200=amount/200;
            amount = amount%200;
            System.out.println("Total Number Of 200 Rupees Notes Or coin : " +r200);
        }
        if(amount>=100)
        {
            r100=amount/100;
            amount = amount%100;
            System.out.println("Total Number Of 100 Rupees Notes Or coin : " +r100);
        }
        if(amount>=50)
        {
            r50=amount/50;
            amount = amount%50;
            System.out.println("Total Number Of 50 Rupees Notes Or coin : " +r100);
        }
        if(amount>=20)
        {
            r20=amount/20;
            amount = amount%20;
            System.out.println("Total Number Of 20 Rupees Notes Or coin : " +r20);
        }
        if(amount>=10)
        {
            r10=amount/10;
            amount = amount%10;
            System.out.println("Total Number Of 10 Rupees Notes Or coin : " +r10);
        }
        count=r2000+r500+r200+r100+r50+r20+r10;
        System.out.println("total Number of note required is  : " +count);
    }
}