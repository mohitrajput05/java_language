import java.util.Scanner;
class V
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=9; j++){
                if(i==j || i+j==10)
                  System.out.printf("*");
                else
                  System.out.printf(" ");
                }
                System.out.printf("\n");
        }
            
             
    }
}