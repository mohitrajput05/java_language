//hollow pyramid star pattern
import java.util.Scanner;

class P8{

  public static void main(String args[]) {
    byte i, j;
    for (i = 5; i >=1; i--) {
      for (j = 1; j <=9; j++) {
        if (j==i||i+j==10||i==1) 
        System.out.printf("*"); 
        else System.out.printf(" ");
      }
      System.out.printf("\n");
    }
  }
}
