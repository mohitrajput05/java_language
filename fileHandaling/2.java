import java.io.File;
class Test{
    public static void main(String arg[]){
        File f = new File("mohit.txt");
        if(f.exists()){
            System.out.println("Name : " + f.getName());
            System.out.println("Path  : " + f.getAbsolutePath());
            System.out.println("Read  : " + f.canRead());
            System.out.println("Wirte  : " + f.canWrite());
            System.out.println("Path  : " + f.canExecute());
            System.out.println("is hidden : " + f.isHidden());
            System.out.println("is  file : " + f.isFile());
            System.out.println("id Directory : " + f.isDirectory());
            System.out.println("Length : " + f.length());
            
        }
    }
    
}
