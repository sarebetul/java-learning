public class Main {
    public static void main(String[] args){
        NotificationUI notificationUI = new NotificationUI();
        notificationUI.notify(new EmailNotification());
        notificationUI.notify(new SmsNotification());
        notificationUI.notify(new PushNotification());
    }
}
