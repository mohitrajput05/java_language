import java.util.Scanner;
class n
{
    public static void main(String args[])
    {
        byte i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=5; j++)
            {
                if(j==1||i==1&&(j>=2&&j<=4)||j==5)
                System.out.printf(" *");
                else
                System.out.printf("  ");
            }
            System.out.printf("\n");
        }
             
    }
}