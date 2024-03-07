package com.biancasleonardo.bank;

/**
 * CurrentAccount
 */
public class CurrentAccount extends Account {

    @Override
    public void printStatement() {
        System.out.println("Conta corrente criada");
        printInfo();
    }



}