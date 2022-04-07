//fill Inverted pyramid star
import java.util.Scanner;

class P13{

  public static void main(String args[]) {
    byte i, j;
    for (i = 6; i >=1; i--) {
      for (j = 1; j <=9; j++) {
        if (i==1&&j>4&&j<6||i==2&&(j>=4&&j<=6)||i==3&&j>2&&j<8||i==4&&(j>1&&j<9)||i==5) 
        System.out.printf("*"); 
        else System.out.printf(" ");
      }
      System.out.printf("\n");
    }
  }
}
