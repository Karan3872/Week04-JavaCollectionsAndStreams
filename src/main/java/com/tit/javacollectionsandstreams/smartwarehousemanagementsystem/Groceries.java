package com.tit.javacollectionsandstreams.smartwarehousemanagementsystem;

class Groceries extends WarehouseItem{

    private String expiryDate;

    Groceries(String name,int quantity,String expiryDate){
        super(name, quantity);
        this.expiryDate=expiryDate;
    }

    public String getExpiryDate(){
        return expiryDate;
    }

    @Override
    public String toString(){
        return super.toString()+ ", ExpiryDate : "+expiryDate;
    }

}
