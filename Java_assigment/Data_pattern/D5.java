//half pyramid
import java.util.Scanner;

class D5 {

  public static void main(String args[]) {
    byte i, j;
    for (i = 1; i <= 4; i++) {
      for (j = 1; j <= i; j++) {
        System.out.printf("%d", i + 2);
      }
      System.out.printf("\n");
    }
    for (i = 3; i >= 1; i--) {
      for (j = 1; j <= i; j++) {
        System.out.printf("%d", i + 2);
      }
      System.out.printf("\n");
    }
  }
}
