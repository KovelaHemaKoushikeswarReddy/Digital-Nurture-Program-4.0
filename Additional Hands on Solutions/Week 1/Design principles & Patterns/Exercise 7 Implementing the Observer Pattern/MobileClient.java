
public class MobileClient implements Listener {
    private String clientId;

    public MobileClient(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public void onStockUpdate(String ticker, double price) {
        System.out.println(clientId + " received update: " + ticker + " now at ₹" + price);
    }
}
