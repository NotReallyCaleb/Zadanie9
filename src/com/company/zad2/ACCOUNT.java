package com.company.zad2;

public class ACCOUNT {
    private String ACCOUNTNAME;
    private double BALANCE;
    public ACCOUNT(String ACCOUNTNAME, double initialBALANCE) {
        this.ACCOUNTNAME = ACCOUNTNAME;
        this.BALANCE = initialBALANCE;
    }
    public int WITHDRAW(int AMOUNT) {
        if (BALANCE >= AMOUNT) {
            BALANCE -= AMOUNT;
            return AMOUNT;
        }
        else {
            throw new INSUFFICIENTFUNDS(AMOUNT);
        }
    }
    public double getBAL() {
        return BALANCE;
    }
}
