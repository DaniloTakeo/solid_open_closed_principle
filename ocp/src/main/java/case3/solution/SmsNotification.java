package case3.solution;

public class SmsNotification implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}