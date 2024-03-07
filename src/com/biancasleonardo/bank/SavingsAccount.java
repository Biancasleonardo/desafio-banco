package com.biancasleonardo.bank;

public class SavingsAccount  extends Account{

    @Override
    public void printStatement() {
        System.out.println("Conta Poupança criada");
        printInfo();
    }

    
}
