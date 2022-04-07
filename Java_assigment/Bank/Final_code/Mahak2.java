import java.io.*;
class Test{
    public static void main(String args[])throws Exception
    {
        File f = new File("1.txt");
        FileReader fr = new FileReader(f);
        Console c = System.console();

        
        String acc = c.readLine("Enter Accont Number : ");
        String s1 = new String();
        int flag=0,count=0;
        char ch;
        int n;
        while((n=fr.read())!=-1){
            ch = (char)(n);
            if(ch!=' ' && flag==1)
            {
                s1+=ch;
            }
            if(ch==' ')
            {
                flag++;
            }
            if(ch=='\n'){
                flag=0;
                if(s1.equals(acc))
                {
                    count++;
                    break;
                }
                s1="";
            }
        }
        fr.close();

        if(count==1){
            File f2 = new File("pass.txt");
            FileWriter fw = new FileWriter(f2,true);
            String pass;
            char chr[];
            chr = c.readPassword("Enter Password : ");
            pass = new String(chr);
            fw.write(acc+ " ");
            fw.write(pass+"\n");
            fw.close();
        }
        else
            System.out.println("Invalid Account Number");
    }
}
