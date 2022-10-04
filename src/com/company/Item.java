package com.company;

public class Item {

    private final int id;
    private String name;
    private int quantity;
    private Double price;

    public Item(int id, String name, int quantity, Double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }


    public String isAvailable(){
        quantity=this.quantity;

        if (quantity==0){
            return "Not Available";
        }
        else
            return "Available";
    }
}
