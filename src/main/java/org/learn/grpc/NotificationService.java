package org.learn.grpc;

public class NotificationService {
    public void sendNotification(String type, String to, String message) {
        if (type.equals("email")) {
            System.out.println("Sending Email to " + to + ": " + message);
        } else if (type.equals("sms")) {
            System.out.println("Sending SMS to " + to + ": " + message);
        } else if (type.equals("push")) {
            System.out.println("Sending Push Notification to " + to + ": " + message);
        }
    }
}
