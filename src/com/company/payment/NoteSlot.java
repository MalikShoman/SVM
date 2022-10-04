package com.company.payment;

public class NoteSlot extends CashSlots {


    public NoteSlot() {

    }

    @Override
    public void calculateTotal(int[] slotNum){
        int slot=0;
        int count=0;
        for (int i=0;i<slotNum.length;i++) {
            if (slotNum[i] > 0) {
                slot = i;
                count = slotNum[i];


                switch (slot) {
                    case 0: {
                        total = total + count * 20;
                    }
                    break;
                    case 1: {
                        total = total + count * 50;
                    }
                    break;
                    default: total=-1;
                        break;
                }
            }

        }
    }
}
