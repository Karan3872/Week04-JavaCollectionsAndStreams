package com.tit.javacollections.listinterface.reversealist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseAList {

    public static List<Integer> reverseArrayList(List<Integer> arr){
        if(arr.size()<=1){
            return arr;
        }

        int start=0;
        int end=arr.size()-1;

        while(start<=end){
            Integer temp = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
        return arr;
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll){
        if(ll.isEmpty()){
            System.out.println("List is empty");
            return ll;
        }

        LinkedList<Integer> temp = new LinkedList<>();

        for(int i=ll.size()-1;i>=0;i--){
            temp.add(ll.get(i));

        }

        return temp;

    }


    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("ArrayList before Reversing");
        System.out.println(l);
        ReverseAList.reverseArrayList(l);
        System.out.println("ArrayList after Reversing");
        System.out.println(l);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        System.out.println("LinkedList before reversing");
        System.out.println(ll);
        ReverseAList.reverseLinkedList(ll);
        System.out.println("LinkedList after reversing");
        System.out.println(ll);
    }

}
