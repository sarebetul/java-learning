public class CreditCardPayment extends BasePaymentSystem{
    @Override
    public void pay(double amount) {
        System.out.println(amount + "TL credit card payment made.");
    }
}
