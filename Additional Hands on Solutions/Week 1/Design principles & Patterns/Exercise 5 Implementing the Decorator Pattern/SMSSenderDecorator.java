
public class SMSSenderDecorator extends AlertDecorator {
    public SMSSenderDecorator(AlertSender sender) {
        super(sender);
    }

    @Override
    public void sendAlert(String msg) {
        super.sendAlert(msg);   // First notify via inner senders
        sendViaSMS(msg);        // Then notify via SMS
    }

    private void sendViaSMS(String msg) {
        System.out.println("SMS alert sent: " + msg);
    }
}
