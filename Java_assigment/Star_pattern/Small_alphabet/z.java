import java.util.Scanner;
class z
{
    public static void main(String args[])
    {
        byte i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=5; j++)
            {
                if(i==1||i==5||j+i==6)
                System.out.printf(" *");
                else
                System.out.printf("  ");
            }
            System.out.printf("\n");
        }
             
    }
}