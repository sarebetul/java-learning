public class Main {
    public static void main(String[] args){
        BaseShape[] shapes = {new Rectangle(5,10), new Circle(7)};
        for(BaseShape shape:shapes){
            System.out.println(shape.calculateArea());
        }
    }
}
