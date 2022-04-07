import java.util.Scanner;
class W
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=7; j++){
                if(j==1&&(i<=4)||j==4&&(i<=4)||i==5&&(j>=2&&j<4)||i==5&&(j>=5&&j<7)||j==7&&(i<=4))
                  System.out.printf(" *");
                else
                  System.out.printf("  ");
                }
                System.out.printf("\n");
        }             
    }
}