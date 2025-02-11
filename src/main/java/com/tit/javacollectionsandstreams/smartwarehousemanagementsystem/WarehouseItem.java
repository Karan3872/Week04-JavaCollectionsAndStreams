package com.tit.javacollectionsandstreams.smartwarehousemanagementsystem;

abstract class WarehouseItem {

    private String name;
    private int quantity;

    WarehouseItem(String name, int quantity){
        this.name=name;
        this.quantity=quantity;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    @Override
    public String toString(){
        return "Name: "+ name+", Quantity : "+quantity;

    }

}
