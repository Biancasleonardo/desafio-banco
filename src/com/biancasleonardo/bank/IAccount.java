package com.biancasleonardo.bank;

public interface IAccount {

    // sacar
    public void withdraw(double value);

    // depositar
    public void deposit( double value);

    // transferir
    public void transfer(double value, Account account);

    public void printStatement();
}
