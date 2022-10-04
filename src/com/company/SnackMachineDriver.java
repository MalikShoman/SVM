package com.company;

import com.company.payment.CardSlot;
import com.company.payment.CoinSlot;
import com.company.payment.NoteSlot;

public class SnackMachineDriver implements SnackMachine{

    private int productId;
    private double total;
    private double balance;
    private int quantity;

    @Override
    public void selectProduct(int productId) {

        this.productId=productId;
        this.quantity=Main.snacks[productId].getQuantity();
        System.out.println(Main.snacks[productId].getName()+"\t"+quantity+" "+Main.snacks[productId].isAvailable()+"\t"
        +Main.snacks[productId].getPrice()+"$\n");


    }

    @Override
    public void displayPaymentMessage() {
        System.out.println( "Please read this before pay:\n"+
                            "\n*\tCoinSlot: There are four denominations: • 10c • 20c • 50c • $1 \n" +
                            "*\tCardSlot : all cards accepted\n" +
                            "*\tNotes Slot :20$ and 50$ only\n" +
                            "*\tMachine only accepts USD currency\n");

    }

    @Override
    public void enterCoins(int[] coins) {
        CoinSlot coinSlot=new CoinSlot();
        coinSlot.calculateTotal(coins);
        this.total=coinSlot.getTotal();
        System.out.println("You have put "+coinSlot.getTotal()+"$\n");

            if (Main.snacks[productId].getPrice()>total){
                System.out.println("You have to enter "+Math.abs(total-(Main.snacks[productId].getPrice()))+"$\n");

            }
            else
            if (Main.snacks[productId].getPrice()<total){
                System.out.println("Machine will dispense you "+Math.abs(total-(Main.snacks[productId].getPrice()))+"$\n");
                Main.snacks[productId].setQuantity(Main.snacks[productId].getQuantity()-1);
                System.out.println("...\n");
                System.out.println("Enjoy *_*\n");

            }
            else
            if (Main.snacks[productId].getPrice()==total){
                Main.snacks[productId].setQuantity(quantity--);
                System.out.println("...\n");
                System.out.println("Enjoy *_*\n");

            }




    }

    @Override
    public void enterNotes(int[] notes) {

        NoteSlot noteSlot=new NoteSlot();
        noteSlot.calculateTotal(notes);
        this.total=noteSlot.getTotal();
        System.out.println("You have put "+noteSlot.getTotal()+"$\n");

        if (Main.snacks[productId].getPrice()>total){
            System.out.println("You have to enter "+Math.abs(total-(Main.snacks[productId].getPrice()))+"$\n");

        }
        else
        if (Main.snacks[productId].getPrice()<total){
            System.out.println("Machine will dispense you "+Math.abs(total-(Main.snacks[productId].getPrice()))+"$\n");
            Main.snacks[productId].setQuantity(Main.snacks[productId].getQuantity()-1);
            System.out.println("...\n");
            System.out.println("Enjoy *_*\n");

        }
        else
        if (Main.snacks[productId].getPrice()==total){
            System.out.println("...\n");
            System.out.println("Enjoy *_*\n");

        }

    }

    @Override
    public void enterCard() {

        CardSlot cardSlot=new CardSlot();

        this.balance=cardSlot.getBalance();
        System.out.println("Card accepted\n");
        System.out.println("Your card balance "+balance+"\n");

        if (Main.snacks[productId].getPrice()>balance){
            System.out.println("You don't have enough money, You have to pay "
                    +Math.abs(balance-(Main.snacks[productId].getPrice()))+"$\n");

        }
        else
        if (Main.snacks[productId].getPrice()<balance){
            cardSlot.calculateTotal(Main.snacks[productId].getPrice());
            System.out.println("Machine decrement from you "
                    +Main.snacks[productId].getPrice()+"\t and your card balance become "
                    +Math.abs(balance-Main.snacks[productId].getPrice())+"$\n");
            Main.snacks[productId].setQuantity(Main.snacks[productId].getQuantity()-1);
            System.out.println("...\n");
            System.out.println("Enjoy *_*\n");

        }
        else
        if (Main.snacks[productId].getPrice()==total){
            System.out.println("...\n");
            System.out.println("Enjoy *_*\n");

        }


    }

}
