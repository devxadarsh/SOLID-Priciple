package com.design.pattern.solid.OCP;

public class MobileNotificationService implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        System.out.println("Sending message using twillio API...");
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("Sending message using  twillio API...");
    }
}
