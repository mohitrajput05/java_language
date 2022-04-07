import java.util.Scanner;
import java.io.*;
class Test
{
  public static void main(String args[])throws Exception{
    File f = new File("1.txt");
    Scanner scan = new Scanner(System.in);
    FileWriter fw = new FileWriter(f,true);
    
    System.out.print("Enter Your First name : ");
    String name=scan.next();

    System.out.print("Enter your Last name : ");
    String lname = scan.next();
    
    System.out.print("Enter Your Father Name : ");
    String fname=scan.next();

    System.out.print("Enter Your Age : ");
    String age=scan.next();

    System.out.print("Enter Your Gender : ");
    String gen=scan.next();

    System.out.print("Enter Your Mobile number : ");
    String mob=scan.next();
    
    System.out.print("Enter Your Address : ");
    String add=scan.next();
    
    System.out.print("Enter Your PIN Code : ");
    String pin=scan.next();
    
    System.out.print("Enter Your Aadhar number : ");
    String aadhar=scan.next();
    
    System.out.print("Enter Your PAN Card Number : ");
    String pan=scan.next();
    
    System.out.print("Enter Your Nationality : ");
    String nat=scan.next();
    
    long min = 10000000l;  
    long max = 99999999l;  
    long a = (long)(Math.random()*(max-min+1)+min);  
    String acc = Long.toString(a);
    System.out.println("Account Number : "+acc);

    Console c = System.console();
    String pass;
    char chr[];
    chr = c.readPassword("Enter Password : ");
    pass = new String(chr);

    fw.write("0 ");
    fw.write(acc+ " ");
    fw.write(pass + " ");
    fw.write(name+" ");
    fw.write(lname+" ");
    fw.write(fname+" ");
    fw.write(age+" ");
    fw.write(gen+" ");
    fw.write(mob+" ");
    fw.write(add+" ");
    fw.write(pin+" ");
    fw.write(aadhar+" ");
    fw.write(pan+" ");
    fw.write(nat+"\n");

    System.out.println("\nAccount created successfully......\n");
    
    fw.close();
  }
}


