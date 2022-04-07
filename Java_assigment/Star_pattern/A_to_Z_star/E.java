import java.util.Scanner;
class E
{
    public static void main(String args[])
    {
        byte i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=5; j++){
            if(j==1&&(i>=2&&i<=4)||i==1&&(j>=2&&j<6)||i==5&&(j>=2&&j<6)||i==3&&(j>2&&j<6))
              System.out.printf("*");
            else
              System.out.printf(" ");
            }
            System.out.printf("\n");
        }
             
    }
}