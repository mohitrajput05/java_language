//hollow mirroried rombus start pattern star
import java.util.Scanner;
class P20{
  public static void main(String args[]) {
    byte i, j;
    for(i=1;i<=5;i++)
    {
        for(j=1;(j<=5-i);j++)
        {
            System.out.printf(" "); 
        }
            for(j=1;j<=5;j++)
            {
                if(i==1||i==5||j==1||j==5)
                System.out.printf("*"); 
                else 
                System.out.printf(" ");
            }
            System.out.println();
    }
  }
}