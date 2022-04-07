import java.io.*;
import java.util.Scanner;

class File2 {

  public static void main(String args[])throws IOException{
      File f = new File("1.txt");
      FileReader fr = new FileReader(f);
      int n;
      char ch;
      while((n=fr.read())!=-1){
          ch=(char)(n);
          System.out.print(ch);
      }
  }
}
