package com.biancasleonardo.bank;

public class SavingsAccount  extends Account{

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Conta Poupança criada ===");
        printInfo();
    }

    
}
