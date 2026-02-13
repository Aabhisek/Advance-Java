package com.abhi.prep.java_advance.twoPointer;

import java.util.HashMap;
import java.util.Map;

public class strobogrammatic {
    static boolean check(String s){
        Map<Character,Character>map=new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');

        int first=0;
        int last=s.length()-1;

        while(first<=last){
            if(map.containsKey(s.charAt(first)) && s.charAt(last)==map.get(s.charAt(first))){
                return true;
        }
            first++;
            last--;

        }

        return false;
    }

    public static void main(String[] args) {
        String s="168891";
        System.out.println(check(s));
    }
}


