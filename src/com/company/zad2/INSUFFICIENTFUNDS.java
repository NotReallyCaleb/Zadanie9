package com.company.zad2;

public class INSUFFICIENTFUNDS extends RuntimeException {
    public INSUFFICIENTFUNDS(int funds) {
        super(String.format("You cant withdraw %d, because your account balance is to low!", funds));
    }
}
