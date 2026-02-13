package com.abhi.prep.java_advance.twoPointer;

public class Appendcharacters {
    static int appendCharacters(String s, String t) {
        int i=0;
        int j=0;

        while(j<t.length() && i<s.length()){

            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else {
                i++;
            }


        }
        return t.length()-j;
    }

    public static void main(String[] args) {
        String s="lbg";
        String t="g";
        System.out.println(appendCharacters(s,t));
    }
}
