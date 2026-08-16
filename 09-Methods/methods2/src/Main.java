public class Main {
    public static void main(String[] args){
        String message = "The weather is nice today";
        String newMessage = giveCity();
        System.out.println(newMessage);
        int num = collect(2,5);
        int sum = collect2(2,6,9,34,90);
        System.out.println(num);
    }
    public static void add(){
        System.out.println("added");
    }
    public static void delete(){
        System.out.println("deleted");
    }
    public static void update(){
        System.out.println("updated");
    }
    public static int collect(int num1, int num2){
        return num1 +  num2;
    }
    public static int collect2(int... numbers){
        int total = 0;
        for(int num:numbers){
            total+=num;
        }
        return total;
    }
    public static String giveCity(){
        return "Ankara";
    }
}