  //Right triangle star
  import java.util.Scanner;
  class P15{
      public static void main(String args[])
      {
        int i,j;
        for(i=7;i>=1;i--)
        {
                for(j=1;j<=7-i;j++){
                    System.out.printf(" ");
    
                }
                for(j=1;j<=i;j++)
                {
                    System.out.printf("*");
                    
                }
            System.out.println();
        }
  }
}