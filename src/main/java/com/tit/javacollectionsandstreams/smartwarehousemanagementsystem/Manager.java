package com.tit.javacollectionsandstreams.smartwarehousemanagementsystem;

import java.util.List;

// Creating a class Warehouse to display all items in storage regardless of their type
class Manager {
    public static void displayAllItemsInStorage(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayItemDetails();
        }
    }
}