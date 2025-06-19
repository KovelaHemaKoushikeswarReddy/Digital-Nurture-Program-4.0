
public class PaymentDemoApp {
    public static void main(String[] args) {

        System.out.println();

        // Create different modes of payment
        PaymentMode cardOption = new CardPay("5678-4321-8765-1234", "Alice Ray");       // (was: CreditCardPayment)
        PaymentMode walletOption = new WalletPay("alice.ray@mail.com");                // (was: PayPalPayment)

        // Use card payment
        PaymentHandler transaction = new PaymentHandler(cardOption);                   // (was: PaymentContext)
        transaction.makePayment(150);

        // Switch to PayPal (wallet) payment
        transaction = new PaymentHandler(walletOption);
        transaction.makePayment(275);
    }
}
