import java.util.Scanner;
class N
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1; i<=4; i++)
        {
            for(j=1; j<=4; j++){
                if(j==1||j==4||i==j&&(i<=5/2+1))
                  System.out.printf("*");
                else
                  System.out.printf(" ");
                }
                System.out.printf("\n");
        }
            
             
    }
}