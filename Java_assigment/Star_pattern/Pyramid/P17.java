//hollow square pattern star with diagonal
import java.util.Scanner;

class P17{

  public static void main(String args[]) {
    byte i, j;
    for (i = 1; i <=5; i++) {
      for (j = 1; j <=5; j++) {
        if (j==1||i==1||i==5||j==5||i+j==6||i==j&&(i<=4)) 
        System.out.printf(" *"); 
        else System.out.printf("  ");
      }
      System.out.printf("\n");
    }
  }
}
