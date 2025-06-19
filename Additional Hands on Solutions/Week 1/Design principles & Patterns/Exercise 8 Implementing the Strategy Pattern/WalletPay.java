
public class WalletPay implements PaymentMode {
    @SuppressWarnings("unused")
    private String userEmail;

    public WalletPay(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public void make(int amount) {
        System.out.println("Transaction of ₹" + amount + " done via PayPal.");
        // Implement wallet processing logic
    }
}
