public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setYear(2024);

        CarManager carManager = new CarManager();
        carManager.show(car);
    }
}
