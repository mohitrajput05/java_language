import java.util.Scanner;
class Vowel{
    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character  :");
        ch=scan.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        System.out.printf("%c character is Vowel",ch);
        else
        System.out.printf("%c character is Consonent",ch);
    }
}