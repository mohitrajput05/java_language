import java.util.Scanner;
class T
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=5; j++){
                if(i==1||j==3)
                  System.out.printf("*");
                else
                  System.out.printf(" ");
                }

                System.out.printf("\n");
        }
            
             
    }
}