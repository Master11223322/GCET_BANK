package com.bank.gcetbank.Job;

public class Soldier extends Job {
    private final String name="Soldier";
    private final String maxCreditAmount="300000";
    private final String maxCreditInstallment ="40";
    private final String interestRate ="2";

    public Soldier() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMaxCreditAmount() {
        return maxCreditAmount;
    }

    @Override
    public String getMaxCreditInstallment() {
        return maxCreditInstallment;
    }
    @Override
    public String getInterestRate() {
        return interestRate;
    }
}
