//Inverted Right triangle star pattern
import java.util.Scanner;
class P4{
    public static void main(String args[]){
        byte i,j;
        for( i=1; i<=7; i++)
        {
            for (j=1; j<=7-i; j++){
            System.out.printf("*");
        }
            System.out.printf("\n");
        }
    }
}


   

