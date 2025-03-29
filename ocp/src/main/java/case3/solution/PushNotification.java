package case3.solution;

public class PushNotification implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Enviando Push Notification: " + message);
    }
}
