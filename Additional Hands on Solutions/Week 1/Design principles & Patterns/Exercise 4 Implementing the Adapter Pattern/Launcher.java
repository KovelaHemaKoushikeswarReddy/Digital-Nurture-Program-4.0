public class Launcher {
    public static void main(String[] args) {
        System.out.println();

        PaymentHandler paypalHandler = new PaypalServiceAdapter(new PaypalService());
        PaymentHandler stripeHandler = new StripeServiceAdapter(new StripeService());

        paypalHandler.handlePayment(1000.0);   // Delegates to PayPal
        stripeHandler.handlePayment(234.0);   // Delegates to Stripe
    }
}
