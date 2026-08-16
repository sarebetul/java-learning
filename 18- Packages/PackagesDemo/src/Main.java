import math.FourTransactions;
import math.Logarithms;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        FourTransactions fourTransactions = new FourTransactions();
        System.out.println(fourTransactions.add(2,3));

        Logarithms logarithms = new Logarithms();
        System.out.println(logarithms.calculateLogarithm(2,10));
    }
}
