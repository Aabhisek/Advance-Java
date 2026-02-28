package com.abhi.prep.java_advance.twoPointer;



public class reversewordsII {

    static String reverseWordsII(String s){
        String[] res=s.split(" ");
        for(int i=0;i<res.length;i++){
            res[i]=reverse(res[i]);
        }
        return String.join(" ",res);
    }
    private static String reverse(String s){
        StringBuilder word=new StringBuilder(s);
        return word.reverse().toString();
    }

    public static void main(String[] args) {
        String s="the sky blue";
        System.out.println(reverseWordsII(s));

    }
}
