public class AccountManager {
    private double balance;
    public void deposit(double amount){
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws BlanceInsufficentException{
        if(balance>=amount) {
            balance = getBalance() - amount;
        }else{
            throw new BlanceInsufficentException("Insufficient balance.");
        }
    }
    public double getBalance(){
        return balance;
    }
}
