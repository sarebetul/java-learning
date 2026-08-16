import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(
                    new FileReader("/Users/sarebetulyazar/Desktop/JAVA/20- Error Management/ReadingFileDemo/src/numbers.txt")
            );
            String line;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println("Total: " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {

            }
        }
    }
}