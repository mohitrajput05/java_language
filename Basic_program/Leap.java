import java.util.Scanner;
class Leap{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int year;
    System.out.println("Enter the year ");
    year = scan.nextShort();
    if (year % 4 == 0||year % 100 == 0 ||year % 400 == 0) 
    System.out.printf("%d is a leap year ",year); 
    else 
    System.out.printf("%d is not a leap year ", year);
  }
}
