
public abstract class AlertDecorator implements AlertSender {
    protected AlertSender wrappedSender;

    public AlertDecorator(AlertSender sender) {
        this.wrappedSender = sender;
    }

    @Override
    public void sendAlert(String msg) {
        wrappedSender.sendAlert(msg); // Forward to inner notifier
    }
}
