import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/sarebetulyazar/Desktop/JAVA/21- Files/example4/students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------");
        writeFile();
        System.out.println("----------------------------------------");
        readFile();
    }
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/sarebetulyazar/Desktop/JAVA/21- Files/example4/students.txt",true));
            writer.write("Sare");
            writer.newLine();
            writer.write("Ahmet");
            writer.newLine();
            writer.write("Elif");
            writer.newLine();
            writer.write("Mehmet");
            System.out.println("written to file");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readFile(){
        File file = new File("/Users/sarebetulyazar/Desktop/JAVA/21- Files/example4/students.txt");
        try{
            Scanner reader = new Scanner(file);
            int total = 0;
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
                total++;
            }
            System.out.println("total number of students: " + total);
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}