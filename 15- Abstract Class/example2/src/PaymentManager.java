public class PaymentManager {
    public void makePayment(BasePaymentSystem paymentSystem, double amount){
        paymentSystem.pay(amount);
    }
}
