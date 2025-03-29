package case3.problem;

public class NotificationService {
    public void sendNotification(String type, String message) {
        if (type.equals("EMAIL")) {
            System.out.println("Enviando e-mail: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Enviando SMS: " + message);
        } else if (type.equals("PUSH")) {
            System.out.println("Enviando Push Notification: " + message);
        } else {
            throw new IllegalArgumentException("Tipo de notificação não suportado");
        }
    }
}
