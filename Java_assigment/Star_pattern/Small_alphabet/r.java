import java.util.Scanner;
class r
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=5; j++){
                if(j==i||j==5-i+1||(i==5&&j>=2&&j<=4))
                  System.out.printf("*");
                else
                  System.out.printf(" ");
                }
                System.out.printf("\n");
        }
            
             
    }
}