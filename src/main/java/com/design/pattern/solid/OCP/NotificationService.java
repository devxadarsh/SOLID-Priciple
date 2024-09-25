package com.design.pattern.solid.OCP;

public interface NotificationService {

    public void sendOTP(String medium);
    public void sendTransactionReport(String medium);
}
