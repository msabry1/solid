package org.learn.grpc;

public class UserManager {
    private NotificationService notificationService = new NotificationService();

    public void registerUser(Employee emp) {
        System.out.println("Registering user...");
        notificationService.sendNotification(
                emp.getPreferredNotificationType(),
                emp.getContactInfo(),
                "Welcome " + emp.getPreferredNotificationType() + " user!"
        );
    }
}
