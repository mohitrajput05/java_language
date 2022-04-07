import java.util.Scanner;
class d
{
    public static void main(String args[])
    {
        byte i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=4; j++)
            {
                if(j==4||(i==3&&j>=2&&j<=4)||(i==5&&j>=2&&j<=4)||i==4&&j==1) 
                System.out.printf("*");
                else
                System.out.printf(" ");
            }
            System.out.printf("\n");
        }
             
    }
}