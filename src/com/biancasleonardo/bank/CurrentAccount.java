package com.biancasleonardo.bank;

/**
 * CurrentAccount
 */
public class CurrentAccount extends Account {

    public CurrentAccount(Client client) {
        super(client);
        
    }

    @Override
    public void printStatement() {
        System.out.println("=== Conta corrente criada ===");
        printInfo();
    }
}