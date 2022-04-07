import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1; i<=6; i++)
        {
            for(j=1; j<=6; j++){
                if(i==1&&(j>=2&&j<5)||i==5&&(j>=2&&j<5)||j==1&&(i>=2&&i<5)||j==5&&(i>=2&&i<5)||i==4&&(j>2&&j<4)||i==6&&(j>5&&j<=6))
                  System.out.printf("*");
                else
                  System.out.printf(" ");
                }
                System.out.printf("\n");
        }
            
             
    }
}