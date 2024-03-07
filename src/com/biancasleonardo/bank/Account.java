package com.biancasleonardo.bank;

public abstract class Account implements IAccount{

    private static final String AGENCY = "1234";
    private static int SEQUENCE = 1;

    protected String agencyNumber;
    protected String accountNumber;
    protected double balance;

    public Account(){
        this.agencyNumber = Account.AGENCY;
        this.accountNumber = Integer.toString(SEQUENCE++);
    }

    protected void printInfo() {
        System.out.println("Agência: " + this.agencyNumber);
        System.out.println("Conta: " + this.accountNumber);
        System.out.println("Saldo: " + this.balance);
    }

    public String getAgencyNumber() {
        return agencyNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // SACAR
    @Override
    public void withdraw(double value) {
        this.balance -= value;
    }

    // DEPOSITAR
    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    // TRANSFERIR
    @Override
    public void transfer(double value, Account accountDestiny) {
        this.withdraw(value);
        accountDestiny.deposit(value);
    }

}
