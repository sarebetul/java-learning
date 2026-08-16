public class Main {
    public static void main(String[] args){
        CustomerManeger customerManeger = new CustomerManeger(new FileLogger());
        customerManeger.add();
    }
}
