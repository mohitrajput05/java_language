import java.util.Scanner;
class j
{
    public static void main(String args[])
    {
        byte i,j;
        for(i=1; i<=6; i++)
        {
            for(j=1; j<=5; j++)
            {
                if(j==3&&i>=3&&i<=6||j==3&&i<2||i==6&&j<4||i==5&&j<2)
                System.out.printf("*");
                else
                System.out.printf(" ");
            }
            System.out.printf("\n");
        }
             
    }
}