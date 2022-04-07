//half pyramid
import java.util.Scanner;
class D4{
    public static void main(String args[]){
        byte i,j;
        for(i=1;i<=5;i++)
    {
        for(j=i;j<=5;j++)
        {
            if(i==1||j==i||j==5)
            System.out.printf("%d ",j);
            else
            System.out.printf("  ");
        }
        System.out.printf("\n");
    }
    
    }
}