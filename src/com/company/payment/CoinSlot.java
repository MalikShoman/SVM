package com.company.payment;

public class CoinSlot extends CashSlots {


    public CoinSlot() {

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
                        total = total + count * 0.1;
                    }
                    break;
                    case 1: {
                        total = total + count * 0.2;
                    }
                    break;
                    case 2: {
                        total = total + count * 0.5;
                    }
                    break;
                    case 3: {
                        total = total + count * 1;
                    }
                    break;
                    default:total=-1;
                        break;
                }
            }

        }
    }
}
