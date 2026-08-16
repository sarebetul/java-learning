public class Main {
    public static void main(String[] args){
        CarManager carManager = new CarManager();
        System.out.println(carManager.start());
        System.out.println(carManager.stop());
        System.out.println(carManager.park());
    }
}
