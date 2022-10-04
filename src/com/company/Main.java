package com.company;

public class Main {

    public static Item[] snacks=new Item[6];

    public static void main(String[] args) {
	// write your code here
        snacks[0]=new Item(0,"chips",5,5.0);
        snacks[1]=new Item(1,"chips",5,51.0);
        snacks[2]=new Item(2,"chips",5,15.0);
        snacks[3]=new Item(3,"chips",5,2.5);
        snacks[4]=new Item(4,"chips",5,20.0);
        snacks[5]=new Item(5,"chips",5,55.0);

        SnackMachineDriver snackMachineDriver=new SnackMachineDriver();
        System.out.println("Enter Snack number, please");
        snackMachineDriver.selectProduct(5);
        snackMachineDriver.displayPaymentMessage();
        //for testing card
//        snackMachineDriver.enterCard();
        //for testing notes
//        snackMachineDriver.enterNotes(new int[]{1, 1});
        //for testing coins
        snackMachineDriver.enterCoins(new int[]{1, 1,3,5});

    }
}
