import java.util.Scanner;
class q
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1; i<=6; i++)
        {
            for(j=1; j<=7; j++){
                if(i==1&&j>1&&j<5||i==3&&j>1&&j<5||i==2&&(j<2)||j==5||i==5&&j>=7)
                  System.out.printf("*");
                else
                  System.out.printf(" ");
                }
                System.out.printf("\n");
        }
            
             
    }
}