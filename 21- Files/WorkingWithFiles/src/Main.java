import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File file = new File("/Users/sarebetulyazar/Desktop/JAVA/21- Files/WorkingWithFiles/student.txt");
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
        System.out.println("----------------------------------------");
        readFile();
        System.out.println("----------------------------------------");
        writeFile();
        System.out.println("----------------------------------------");
        readFile();
    }
    public static void getFileInfo(){
        File file = new File("/Users/sarebetulyazar/Desktop/JAVA/21- Files/WorkingWithFiles/student.txt");
        if(file.exists()){
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());
            System.out.println("Can the file be written: " + file.canWrite());
            System.out.println("Can the file be readable: " + file.canRead());
            System.out.println("File size (bytes): " + file.length());
        }
    }
    public static void readFile(){
        File file = new File("/Users/sarebetulyazar/Desktop/JAVA/21- Files/WorkingWithFiles/student.txt");
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/sarebetulyazar/Desktop/JAVA/21- Files/WorkingWithFiles/student.txt",true));
            writer.newLine();
            writer.write("Ali");
            System.out.println("written to file");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
