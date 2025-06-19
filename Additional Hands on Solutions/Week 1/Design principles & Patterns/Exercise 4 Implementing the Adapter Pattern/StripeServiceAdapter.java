public class StripeServiceAdapter implements PaymentHandler {
    private final StripeService stripe;

    public StripeServiceAdapter(StripeService stripe) {
        this.stripe = stripe;
    }

    @Override
    public void handlePayment(double amount) {
        stripe.initiateCharge(amount);
    }
}
