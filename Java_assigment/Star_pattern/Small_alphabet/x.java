import java.util.Scanner;
class x
{
    public static void main(String args[])
    {
        byte i,j;
        for(i=5; i>=1; i--)
        {
            for(j=1; j<=5; j++)
            {
                if(i==j||i+j==6)
                System.out.printf(" *");
                else
                System.out.printf("  ");
            }
            System.out.printf("\n");
        }
             
    }
}