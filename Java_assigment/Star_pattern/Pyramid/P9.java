//plus star
import java.util.Scanner;

class P9{

  public static void main(String args[]) {
    byte i, j;
    for (i = 1; i <=5; i++) {
      for (j = 1; j <=5; j++) {
        if (j==3||i==3) 
        System.out.printf("+"); 
        else System.out.printf(" ");
      }
      System.out.printf("\n");
    }
  }
}
