import java.util.Scanner;
class K
{
    public static void main(String args[])
    {
        int i,j,x=5/2+1;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=5; j++){
                if(j==1||j==x)
                  System.out.printf("*");
                else
                  System.out.printf(" ");
                }
                if(i<=x)
                x--;
                else
                x++;
                System.out.printf("\n");
        }
            
             
    }
}