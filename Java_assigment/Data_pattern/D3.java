//half pyramid
import java.util.Scanner;
class D3{
    public static void main(String args[]){
        byte i,j;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=5; j++){
                if(j==1||i==5||j==i)
            System.out.printf("%d",j);
            else
            System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }
}