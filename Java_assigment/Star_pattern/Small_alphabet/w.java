import java.util.Scanner;
class w
{
    public static void main(String args[])
    {
        byte i,j;
        for(i=5; i>=1; i--)
        {
            for(j=1; j<=5; j++)
            {
                if(j==1&&i>=2&&i<=5||j==3&&i>1&&i<=3||j==5&&i>=2&&i<=5||i==1&&j>1&&j<=3||i==1&&j>=3&&j<5)
                System.out.printf(" *");
                else
                System.out.printf("  ");
            }
            System.out.printf("\n");
        }
             
    }
}