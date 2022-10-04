package com.company.payment;

public class CardSlot {

    private double total;
    private double balance=100.0;

    public CardSlot() {

    }

    public double getTotal() {
        return total;
    }

    public double getBalance() {
        return balance;
    }

    public void calculateTotal(double price){
        total=balance-price;

    }
}
