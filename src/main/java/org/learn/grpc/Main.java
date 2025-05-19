package org.learn.grpc;



// App.java
public class Main {
    public static void main(String[] args) {
        Employee user = new Employee("Ahmed", "ahmed@example.com", "email");
        UserManager manager = new UserManager();
        manager.registerUser(user);
    }
}