import java.io.*;
import java.util.Scanner;
class Read{
    public static void main(String args[])throws Exception
    {
        File f = new File("1.txt");
        FileReader fr = new FileReader(f);
        int n,flag=0;
        char ch;
        String name = new String();
        String fname = new String();
        String age = new String();
        String gender = new String();
        String mob = new String();
        String add = new String();
        String pin = new String();
        String aadhar = new String(); 
        String pan = new String();
        String nat = new String();
        String amt = new String();
        String lname = new String();
        String acc = new String();
        String pass = new String();
        // int i=0;

            while((n=fr.read())!=-1){
                ch = (char)(n);
                if(ch!=' ' && flag==0){
                    amt+=ch;
                }
                else if(ch!=' ' && flag==1){
                    acc+=ch;
                }
                else if(ch!=' ' && flag==2){
                    pass+=ch;
                }
                else if(ch!=' ' && flag==3){
                    name+=ch;
                }
                else if(ch!=' ' && flag==4){
                    lname+=ch;
                }
                else if(ch==' ')
                {
                    flag++;
                }
                else if(ch!=' ' && flag==5){
                    fname += ch;
                }
                else if(ch!=' ' && flag==6){
                    age += ch;
                }
                else if(ch!=' ' && flag==7){
                    gender += ch;
                }
                else if(ch!=' ' && flag==8){
                    mob += ch;
                }
                else if(ch!=' ' && flag==9){
                    add += ch;
                }
                else if(ch!=' ' && flag==10){
                    pin += ch;
                }
                else if(ch!=' ' && flag==11){
                    aadhar += ch;
                }
                else if(ch!=' ' && flag==12){
                    pan += ch;
                }
                else if(ch!=' ' && flag==13){
                    nat += ch;
                }
                if(ch=='\n'){
                    flag=0;
                    System.out.print(amt+" ");
                    System.out.print(acc + " ");
                    System.out.print(name+" ");
                    System.out.print(lname+" ");
                    System.out.print(fname+" ");
                    System.out.print(age+" ");
                    System.out.print(gender+" ");
                    System.out.print(mob+" ");
                    System.out.print(add+" ");
                    System.out.print(pin+" ");
                    System.out.print(aadhar+" ");
                    System.out.print(pan+" ");
                    System.out.print(nat+"\n");

                    name="";
                    fname="";
                    age="";
                    gender="";
                    mob="";
                    add="";
                    pin="";
                    aadhar="";
                    pan="";
                    nat="";
                }
        }   
    }
}