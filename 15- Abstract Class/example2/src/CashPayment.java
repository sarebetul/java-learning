public class CashPayment extends BasePaymentSystem{
    @Override
    public void pay(double amount) {
        System.out.println(amount + "TL cash payment made");
    }
}
