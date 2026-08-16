public class Main {
    public static void main(String[] args){
        AccountManager manager = new AccountManager();
        System.out.println("bill = " + manager.getBalance());
        manager.deposit(100);
        System.out.println("bill = " + manager.getBalance());
        try{
            manager.withdraw(90);
        }catch (BlanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("bill = " + manager.getBalance());
        try{
            manager.withdraw(20);
        } catch (BlanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("bill = " + manager.getBalance());
    }
}
