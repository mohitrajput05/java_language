//diamond star
import java.util.Scanner;

class P11{

  public static void main(String args[]) {
    byte i, j;
    for (i = 1; i <=5; i++) {
      for (j = 1; j <=5; j++) {
        if (i==1&&j>2&&j<4||i==2&&(j>=2&&j<=4)||i==3||i==5&&j>2&&j<4||i==4&&(j>=2&&j<=4)) 
        System.out.printf("*"); 
        else System.out.printf(" ");
      }
      System.out.printf("\n");
    }
  }
}
