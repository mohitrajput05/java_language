import java.util.Scanner;
import java.io.*;

class Test {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        File f = new File("mohit.txt");
        // try{
        //  FileOutputStream fout = new FileOutputStream(f);
        //  System.out.println("enter the content you want to enter");
        //  String s= sc.nextLine();
        //  byte data[]=s.getBytes();
        //  fout.write(data);
        // }
        // catch(Exception e) {
        //     System.out.println("Successfully exception handle");
        // }
    
        try{
        FileInputStream fis = new FileInputStream(f);
        int  s= fis.read();
        //byte data[]=s.getBytes();
        
       }
       catch(Exception e) {
           System.out.println("Successfully exception handle");
       }
    }

}