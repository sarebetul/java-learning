import java.io.*;

public class Main {
  public static void main(String[] args){
    File file = new File("/Users/sarebetulyazar/Desktop/JAVA/21- Files/example3/productss.txt");
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
    writeFile();
  }

  public static void writeFile(){
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/sarebetulyazar/Desktop/JAVA/21- Files/example3/productss.txt",true));
      writer.newLine();
      writer.write("Mouse");
      writer.newLine();
      writer.write("Keyboard");
      writer.newLine();
      writer.write("Monitor");
      System.out.println("written to file");
      writer.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
