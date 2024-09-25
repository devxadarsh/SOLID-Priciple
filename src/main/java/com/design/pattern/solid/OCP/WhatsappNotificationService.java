package com.design.pattern.solid.OCP;

public class WhatsappNotificationService implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        System.out.println("Sending message using  Whatsapp Integrated API...");
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("Sending message using  Whatsapp Integrated API...");
    }
}
