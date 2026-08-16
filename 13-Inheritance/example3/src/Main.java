public class Main {
    public static void main(String[] args){
        PayUI payUI = new PayUI();
        payUI.MakePayment(new CashManager());
        payUI.MakePayment(new CreditCardManager());
        payUI.MakePayment(new TransferManager());
    }
}
