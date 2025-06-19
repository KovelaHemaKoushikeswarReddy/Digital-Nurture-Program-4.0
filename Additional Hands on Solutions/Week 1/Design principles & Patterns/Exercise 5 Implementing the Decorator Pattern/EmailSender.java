
public class EmailSender implements AlertSender {
    @Override
    public void sendAlert(String msg) {
        System.out.println("Email alert dispatched: " + msg);
    }
}
