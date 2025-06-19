public class PaypalServiceAdapter implements PaymentHandler {
    private final PaypalService paypal;

    public PaypalServiceAdapter(PaypalService paypal) {
        this.paypal = paypal;
    }

    @Override
    public void handlePayment(double amount) {
        paypal.executeTransaction(amount);
    }
}
