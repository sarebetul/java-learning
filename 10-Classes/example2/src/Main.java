public class Main {
    public static void main(String[] args){
        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.add(15,25));
        System.out.println(calculator1.subtract(50,18));
        System.out.println(calculator1.multiply(7,8));
        System.out.println(calculator1.divide(100,4));
        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.add(23,67));
        System.out.println(calculator2.subtract(39,8));
        System.out.println(calculator2.multiply(34,6));
        System.out.println(calculator2.divide(35,7));
    }
}
