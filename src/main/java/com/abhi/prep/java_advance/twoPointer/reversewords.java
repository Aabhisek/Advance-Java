package com.abhi.prep.java_advance.twoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reversewords {
    static String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            // skip spaces
            while(i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            if(i >= s.length()) break;
            // start of word
            int start = i;
            // move till end of word
            while(i < s.length() && s.charAt(i) != ' ') {
                i++;
            }
            // store word
            words.add(s.substring(start, i));
        }
        // reverse words
        Collections.reverse(words);
        // join
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String s="  the sky   is blue  ";
        System.out.println(reverseWords(s));
    }
}
