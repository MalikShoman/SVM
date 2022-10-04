package com.company;

public interface SnackMachine {


    void selectProduct(int productId);

    void displayPaymentMessage();

    void enterCoins(int[] coins);

    void enterNotes(int[] notes);

    void enterCard();


}
