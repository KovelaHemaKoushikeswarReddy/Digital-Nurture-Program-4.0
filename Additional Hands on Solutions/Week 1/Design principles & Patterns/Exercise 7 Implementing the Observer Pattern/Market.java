
public interface Market {
    void addSubscriber(Listener listener);
    void removeSubscriber(Listener listener);
    void broadcast();
}
