package org.learn.grpc;

public class RemoteEmployee extends Employee {
    private String remoteLocation;

    public RemoteEmployee(String name, String contactInfo, String preferredNotificationType, String remoteLocation) {
        super(name, contactInfo, preferredNotificationType);
        this.remoteLocation = remoteLocation;
    }

    public String getRemoteLocation() {
        return remoteLocation;
    }

    @Override
    public double calculateIncomeTax(double income) {
        return income * 0.15;
    }
}
