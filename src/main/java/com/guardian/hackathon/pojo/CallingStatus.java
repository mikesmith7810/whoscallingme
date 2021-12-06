package com.guardian.hackathon.pojo;

public class CallingStatus {

    private boolean fraud;
    private String accountNumber;
    private String numberCalled;
    private String statusMessage;

    public String getNumberCalled() {
        return numberCalled;
    }

    public void setNumberCalled(String numberCalled) {
        this.numberCalled = numberCalled;
    }


    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

}
