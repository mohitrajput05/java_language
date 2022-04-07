//mirrored fillrombus start pattern star
import java.util.Scanner;
class P22{
  public static void main(String args[]) {
    byte i, j;
    for(i=7;i>=1;i--)
    {
        for(j=7;(j>=1+i);j--)
        {
            System.out.printf(" "); 
        }
            for(j=7;(j>=1);j--)
            {
                System.out.printf("*"); 
                
            }
            System.out.println();
    }
  }
}