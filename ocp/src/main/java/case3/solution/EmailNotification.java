package case3.solution;

public class EmailNotification implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Enviando e-mail: " + message);
    }
}