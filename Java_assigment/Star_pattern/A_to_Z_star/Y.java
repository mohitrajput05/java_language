import java.util.Scanner;
class Y
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=5; j++){
               // if(i+j==6||(i==j&&i<=3))
                if(i==j&&i<=3||j==5-i+1)
                  System.out.printf("*");
                else
                  System.out.printf(" ");
                }
                System.out.printf("\n");
        }             
    }
}