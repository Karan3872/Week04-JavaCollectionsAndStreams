package com.tit.javacollectionsandstreams.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

class Manager {

    public static void displayItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item : items){
            System.out.println(item);
        }
    }

}
