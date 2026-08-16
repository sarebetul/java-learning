import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    File file = new File("/Users/sarebetulyazar/Desktop/JAVA/21- Files/example2/students.txt");
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
      BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/sarebetulyazar/Desktop/JAVA/21- Files/example2/students.txt",true));
      writer.newLine();
      writer.write("Ali");
      writer.newLine();
      writer.write("Ayşe");
      writer.newLine();
      writer.write("Mehmet");
      writer.newLine();
      writer.write("Zeynep");
      System.out.println("written to file");
      writer.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  public static void readFile(){
    File file = new File("/Users/sarebetulyazar/Desktop/JAVA/21- Files/example2/students.txt");
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
}
