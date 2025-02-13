package com.tit.javacollections.setinterface.checkiftwosetsareequal;

import java.util.Set;

public class Check {

    public static <T> Boolean check(Set<T> set1,Set<T> set2){

        if(set2.containsAll(set1)){
            return true;
        }else{
            return false;
        }

    }


}
