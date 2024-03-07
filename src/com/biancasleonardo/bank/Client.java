package com.biancasleonardo.bank;

import java.util.UUID;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public String getCPF() {
        return CPF;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    
}
