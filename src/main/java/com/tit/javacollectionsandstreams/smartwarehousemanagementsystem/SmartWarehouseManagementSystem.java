package com.tit.javacollectionsandstreams.smartwarehousemanagementsystem;

public class SmartWarehouseManagementSystem {

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.AddItem(new Electronics("television",2,"2 years"));
        electronicsStorage.AddItem(new Electronics("fan",5,"1 year"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.AddItem(new Groceries("dragon fruit",6,"upto  next day"));
        groceriesStorage.AddItem(new Groceries("banana",12,"upto 2 day"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.AddItem(new Furniture("Almirah",1,"iron"));
        furnitureStorage.AddItem(new Furniture("Table",4,"wood"));

        System.out.println("Electronics Items : ");
        Manager.displayItems(electronicsStorage.getAllItems());

        System.out.println("Groceries Items : ");
        Manager.displayItems(groceriesStorage.getAllItems());

        System.out.println("Furniture Items : ");
        Manager.displayItems(furnitureStorage.getAllItems());

    }

}
