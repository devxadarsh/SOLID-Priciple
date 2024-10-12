package com.design.pattern.solid.ISP;

public class GooglePay implements UPIPayments, CashbackManager
{
    @Override
    public void getCashbackAsCredit() {

    }

    @Override
    public void payMoney(double money) {

    }

    @Override
    public void getScratchCard() {

    }
}
