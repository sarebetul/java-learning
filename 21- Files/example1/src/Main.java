import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        File file = new File("/Users/sarebetulyazar/Desktop/JAVA/21- Files/example1/notes.txt");
        try{
            if(file.createNewFile()){
                System.out.println("file created");
            }else{
                System.out.println("file already exists");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("----------------------------------------");
        getFileInfo();
    }
    public static void getFileInfo() {
        File file = new File("/Users/sarebetulyazar/Desktop/JAVA/21- Files/example1/notes.txt");
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());
            System.out.println("Can the file be written: " + file.canWrite());
            System.out.println("Can the file be readable: " + file.canRead());
            System.out.println("File size (bytes): " + file.length());
        }
    }
}
