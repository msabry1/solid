package org.learn.grpc;

public class Employee {
    private String name;
    private String contactInfo;
    private String preferredNotificationType;
    double income;

    public Employee(String name, String contactInfo, String preferredNotificationType) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.preferredNotificationType = preferredNotificationType;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getPreferredNotificationType() {
        return preferredNotificationType;
    }

    public double calculateIncomeTax(double income) {
        return income * 0.2;
    }
}
