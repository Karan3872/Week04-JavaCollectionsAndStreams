package com.tit.javacollectionsandstreams.smartwarehousemanagementsystem;

class Furniture extends WarehouseItem{

    private String material;

    Furniture(String name,int quantity,String material){
        super(name,quantity);
        this.material=material;
    }

    @Override
    public String toString(){
        return super.toString()+", Material : "+material;
    }

}
