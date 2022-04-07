//half pyramid
import java.util.Scanner;
class D2{
    public static void main(String args[]){
        byte i,j;
        for(i=5; i>=1; i--)
        {
            for(j=1; j<=i; j++){
            System.out.printf("%d",j);
            }
            System.out.printf("\n");
        }
    }
}