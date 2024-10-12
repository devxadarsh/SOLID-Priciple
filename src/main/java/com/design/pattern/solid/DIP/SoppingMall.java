package com.design.pattern.solid.DIP;

public class SoppingMall {

    private final BankCard bankCard;

    public SoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doSomePurchase(long amount) {
        bankCard.doTransaction(amount);
    }

    public void purchaseItemUsingCredit() {
        // Purchase item using the bank card
        BankCard bankCard = new CreditCard();
        SoppingMall soppingMall = new SoppingMall(bankCard);
        soppingMall.doSomePurchase(100);
    }

    public void purchaseItemUsingDebit() {
        // Purchase item using the bank card
        BankCard bankCard = new DebitCard();
        SoppingMall soppingMall = new SoppingMall(bankCard);
        soppingMall.doSomePurchase(100);
    }
}
