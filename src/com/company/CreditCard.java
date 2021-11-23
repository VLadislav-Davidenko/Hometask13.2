package com.company;

import java.io.Serializable;

public class CreditCard implements Serializable {
    String cardType;
    String bankName;
    String bankNumber;
    transient int exp;
    transient int cvv;

    public CreditCard(String cardType, String bankName, String bankNumber, int exp, int cvv) {
        this.cardType = cardType;
        this.bankName = bankName;
        this.bankNumber = bankNumber;
        this.exp = exp;
        this.cvv = cvv;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "bankName='" + bankName + '\'' +
                ", bankNumber='" + bankNumber + '\'' +
                ", exp=" + exp +
                ", cvv=" + cvv +
                '}';
    }
}
