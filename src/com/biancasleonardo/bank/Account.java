package com.biancasleonardo.bank;

import lombok.Data;

@Data
public abstract class Account implements IAccount{

    private static final String AGENCY = "1234";
    private static int SEQUENCE = 1;

    protected String agencyNumber;
    protected String accountNumber;
    protected double balance;
    protected Client client;

    public Account(Client client){
        this.agencyNumber = Account.AGENCY;
        this.accountNumber = Integer.toString(SEQUENCE++);
        this.client = client;
    }

    protected void printInfo() {
        System.out.println("Id: " + this.client.getClientId() + " Cliente: " + this.client.getName() + " - " + this.client.getCPF());
        System.out.println("Agência: " + this.agencyNumber);
        System.out.println("Conta: " + this.accountNumber);
        System.out.println("Saldo: " + this.balance);
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
