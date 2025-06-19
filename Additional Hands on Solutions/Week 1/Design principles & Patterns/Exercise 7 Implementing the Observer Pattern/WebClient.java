
public class WebClient implements Listener {
    private String clientId;

    public WebClient(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public void onStockUpdate(String ticker, double price) {
        System.out.println(clientId + " received update: " + ticker + " now at ₹" + price);
    }
}
