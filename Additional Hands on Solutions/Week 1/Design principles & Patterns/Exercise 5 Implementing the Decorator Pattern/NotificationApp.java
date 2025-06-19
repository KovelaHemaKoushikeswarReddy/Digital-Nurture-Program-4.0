
public class NotificationApp {
    public static void main(String[] args) {
        System.out.println();

        // Create a base notifier that uses email
        AlertSender basicSender = new EmailSender();

        // Enhance with SMS sending capabilities
        AlertSender smsEnabledSender = new SMSSenderDecorator(basicSender);

        // Further enhance with Slack notifications
        AlertSender fullSender = new SlackSenderDecorator(smsEnabledSender);

        // Trigger the complete notification chain
        fullSender.sendAlert("This is a sample alert message!");
    }
}
