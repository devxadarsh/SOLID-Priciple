package com.design.pattern.solid.OCP;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        System.out.println("Sending mail using javaMailSenderAPI...");
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("Sending mail using javaMailSenderAPI...");
    }
}
