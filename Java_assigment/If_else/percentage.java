import java.util.Scanner;
class percentage{
    public static void main(String args[]){
        int hindi,maths,english,science,soScience;
        float percentage;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter  the marks of Hindi");
        hindi = scan.nextInt();
        System.out.println("Enter  the marks of Maths");
        maths = scan.nextInt();
        System.out.println("Enter  the marks of English");
        english = scan.nextInt();
        System.out.println("Enter  the marks of Science");
        science = scan.nextInt();
        System.out.println("Enter  the marks of So.Science");
        soScience = scan.nextInt();
        percentage=(hindi+maths+english+science+soScience)/5f;
        System.out.println("percentage of all subject is : "+percentage);
        if(percentage>60)
        System.out.println("First Division");
        else if(percentage>50&& percentage>59)
        System.out.println("Second Division");
        else if(percentage>33&& percentage>49)
        System.out.println("Third Division");
        else
        System.out.println("Fail");
        
    }
}