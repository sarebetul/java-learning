public class Main {
    public static void main(String[] args){
        PaymentManager manager = new PaymentManager();
        manager.makePayment(new CreditCardPayment(), 5000);
        manager.makePayment(new CashPayment(), 2500);
        manager.makePayment(new BankTransferPayment(), 7500);
    }
}
