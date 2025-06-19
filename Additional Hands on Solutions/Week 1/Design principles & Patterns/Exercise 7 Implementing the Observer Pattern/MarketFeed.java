
import java.util.ArrayList;
import java.util.List;

public class MarketFeed implements Market {
    private List<Listener> listenerList;
    private String tickerName;
    private double currentPrice;

    public MarketFeed(String tickerName, double price) {
        this.tickerName = tickerName;
        this.currentPrice = price;
        this.listenerList = new ArrayList<>();
    }

    public void updatePrice(double newPrice) {
        this.currentPrice = newPrice;
        broadcast(); // Inform all listeners of the update
    }

    @Override
    public void addSubscriber(Listener listener) {
        listenerList.add(listener);
    }

    @Override
    public void removeSubscriber(Listener listener) {
        listenerList.remove(listener);
    }

    @Override
    public void broadcast() {
        for (Listener listener : listenerList) {
            listener.onStockUpdate(tickerName, currentPrice);
        }
    }
}
