
public class NotificationAppDemo {
    public static void main(String[] args) {

        System.out.println();

        // Create a MarketFeed instance
        MarketFeed techFeed = new MarketFeed("NextGenTech", 150.0); // (was: StockMarket)

        // Create notifier objects
        MobileClient androidClient = new MobileClient("AndroidTracker"); // (was: MobileApp)
        WebClient browserClient = new WebClient("BrowserTracker");      // (was: WebApp)

        // Subscribe to updates
        techFeed.addSubscriber(androidClient);
        techFeed.addSubscriber(browserClient);

        // First price change
        System.out.println("Changing stock value...");
        techFeed.updatePrice(160.0);

        // Remove one subscriber
        techFeed.removeSubscriber(browserClient);

        // Second price change
        System.out.println("Changing stock value again...");
        techFeed.updatePrice(170.0);
    }
}
