package com.design.pattern.solid.SRP;

public class NotificationService {

    public void sendOTP(String medium) {
        if (medium.equals("mail")) {
            System.out.println("Sending mail using javaMailSenderAPI...");
        }
        if (medium.equals("mobile")) {
            System.out.println("Sending message using twillioAPI...");
        }

    }
}
