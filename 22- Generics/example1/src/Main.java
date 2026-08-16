public class Main {
    public static void main(String[] args){
        Box<String> box1 = new Box<>("Java");
        Box<Integer> box2 = new Box<>(100);
        System.out.println(box1.getValue());
        System.out.println(box2.getValue());
    }
}
