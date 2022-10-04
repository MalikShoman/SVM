package com.company.payment;

public abstract class CashSlots {

    public double total;

    public CashSlots() {

    }

    public double getTotal() {
        return total;
    }

    public abstract void calculateTotal(int[] slotNum);
}
