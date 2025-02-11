package com.tit.javacollectionsandstreams.smartwarehousemanagementsystem;

class Electronics extends WarehouseItem {

    private String warranty;

    Electronics(String name, int quantity,String warranty){
        super(name, quantity);
        this.warranty=warranty;
    }

    public String getWarranty(){
        return warranty;
    }

    @Override
    public String toString(){
        return super.toString() + ", Warranty : "+warranty;
    }

}
