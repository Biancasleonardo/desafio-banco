package com.biancasleonardo.bank;

import java.util.UUID;

import lombok.Data;

@Data
public class Client {

    private UUID clientId = UUID.randomUUID();
    private String name;
    private String CPF;
    private String phone;
    private String email;

    public Client(String name, String cPF, String phone, String email) {
        this.name = name;
        CPF = cPF;
        this.phone = phone;
        this.email = email;
    }

    public Client() {
    }
    
}
