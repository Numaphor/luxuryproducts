package com.example.gamewebshop.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Giftcard {

    @Id
    @GeneratedValue
    private long id;
    private double balance;
    @Column(length = 500)
    private String code;
    private String pin;
    private String owner;

    public Giftcard() {
    }

    public Giftcard(String owner, String code, double balance, String pin) {
        this.owner = owner;
        this.code = code;
        this.balance = balance;
        this.pin = pin;
    }

    // getters and setters for each variable
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
