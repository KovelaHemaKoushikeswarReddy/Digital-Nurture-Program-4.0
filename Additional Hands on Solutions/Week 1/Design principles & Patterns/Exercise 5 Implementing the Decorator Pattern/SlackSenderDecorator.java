
public class SlackSenderDecorator extends AlertDecorator {
    public SlackSenderDecorator(AlertSender sender) {
        super(sender);
    }

    @Override
    public void sendAlert(String msg) {
        super.sendAlert(msg);       // Call inner sender
        notifyThroughSlack(msg);    // Then notify via Slack
    }

    private void notifyThroughSlack(String msg) {
        System.out.println("Slack alert posted: " + msg);
    }
}
