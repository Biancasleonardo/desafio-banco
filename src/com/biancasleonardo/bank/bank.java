package com.biancasleonardo.bank;

import java.util.List;

import lombok.Data;

/**
 * bank
 */
@Data
public class bank {

    public String bankName;
    public String bankId;
    private List<Account> accounts;

}