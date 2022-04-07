import java.io.*;
import java.util.Scanner;
class File1 {

  public static void main(String args[]) throws IOException 
  {
    File f = new File("1.txt");
    FileWriter fw = new FileWriter(f, true);
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a Name : ");
    String s1 = scan.nextLine();
    System.out.print("Enter a Father Name : ");
    String s2 = scan.nextLine();
    System.out.print("Enter a Date of Birth : ");
    String s3 = scan.nextLine();
    System.out.print("Enter a age : ");
    String s4 = scan.nextLine();
    System.out.print("Enter a Adhar card Number : ");
    String s5 = scan.nextLine();
    System.out.print("Enter a Initial Amount : ");
    int n = scan.nextInt();
    fw.write(n + " " + "\n");
    fw.write(s1 + " " + "\n");
    fw.write(s2 + " " + "\n");
    fw.write(s3 + " " + "\n");
    fw.write(s4 + " " + "\n");
    fw.write(s5 + " ");
    fw.close();
  }
}
