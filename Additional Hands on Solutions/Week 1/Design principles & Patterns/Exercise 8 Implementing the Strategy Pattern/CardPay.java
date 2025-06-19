
public class CardPay implements PaymentMode {
    @SuppressWarnings("unused")
    private String number;
    @SuppressWarnings("unused")
    private String holderName;

    public CardPay(String number, String holderName) {
        this.number = number;
        this.holderName = holderName;
    }

    @Override
    public void make(int amount) {
        System.out.println("Transaction of ₹" + amount + " done via Credit Card.");
        // Implement credit card logic here
    }
}
