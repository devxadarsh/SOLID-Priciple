package com.design.pattern.solid.SRP;

public class LoanService {

    public void getLoanInfo( String loanType) {
        if (loanType.equals("Home")) {
            System.out.println("Getting the Home loan Info...");
        } else if (loanType.equals("Personal")) {
            System.out.println("Getting the Personal loan Info...");
        } else if (loanType.equals("Car")) {
            System.out.println("Getting the Car loan Info...");
        }
    }
}
