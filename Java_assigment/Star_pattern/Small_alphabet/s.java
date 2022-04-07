import java.util.Scanner;
class s
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=5; j++){
                if(i==1||i==3||i==5||j==1&&(i>=2&&i<4)||j==5&&(i>=3&&i<5))
                  System.out.printf("*");
                else
                  System.out.printf(" ");
                }

                System.out.printf("\n");
        }
            
             
    }
}