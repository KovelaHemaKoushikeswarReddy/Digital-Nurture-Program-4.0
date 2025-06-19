
public class PaymentHandler {
    private PaymentMode method;

    public PaymentHandler(PaymentMode method) {
        this.method = method;
    }

    public void makePayment(int amount) {
        method.make(amount);
    }
}
