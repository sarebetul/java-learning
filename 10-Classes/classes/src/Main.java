public class Main {
    public static void main(String[] args){
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        int num1 = 10;
        int num2 = 20;
        num2=num1;
        num1 = 30;
        System.out.println(num2);

        int[] numbers1 = {1,2,3};
        int[] numbers2 = {4,5,6};
        numbers1 = numbers2;
        numbers1[0]=10;
        System.out.println(numbers2[0]);
    }
}