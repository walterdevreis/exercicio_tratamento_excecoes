package model.entities;

import model.DomainException.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        balance = amount;
    }

    public void withdraw(Double amount){
        if (amount > getBalance()) {
            throw new DomainException("Not enough balance");
        } else if (amount > getWithdrawLimit()) {
            throw new DomainException("The amount exceeds withdraw limit ");
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return String.format("New balance: %.2f", getBalance());
    }
}
