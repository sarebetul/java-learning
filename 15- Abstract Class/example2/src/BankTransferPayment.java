public class BankTransferPayment extends BasePaymentSystem{
    @Override
    public void pay(double amount) {
        System.out.println(amount + "TL bank transfer was made.");
    }
}
