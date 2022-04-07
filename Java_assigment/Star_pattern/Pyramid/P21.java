//hollow miroorred rombus start pattern star
import java.util.Scanner;
class P21{
  public static void main(String args[]) {
    byte i, j;
    for(i=5;i>=1;i--)
    {
        for(j=5;(j>=1+i);j--)
        {
            System.out.printf(" "); 
        }
            for(j=5;j>=1;j--)
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