import java.util.Scanner;
class f
{
    public static void main(String args[])
    {
        byte i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=5; j++)
            {
                if(i==1&&(j>=3&&j<=4)||j==2&&(i>=2)||i==3&&(j<=3)||i==2&&(j>4))
                System.out.printf("*");
                else
                System.out.printf(" ");
            }
            System.out.printf("\n");
        }
             
    }
}