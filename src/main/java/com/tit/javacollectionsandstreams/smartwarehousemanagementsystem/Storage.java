package com.tit.javacollectionsandstreams.smartwarehousemanagementsystem;

import java.util.List;
import java.util.ArrayList;

 class Storage <T extends WarehouseItem>{

    private List<T> items;

    Storage(){
        items = new ArrayList<>();
    }

    public void AddItem(T item){
        items.add(item);
    }

    public T getItem(int index){
        return items.get(index);
    }

    public List<T> getAllItems(){
        return items;
    }

}
