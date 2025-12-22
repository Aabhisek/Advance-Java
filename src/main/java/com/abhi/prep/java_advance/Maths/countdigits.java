package com.abhi.prep.java_advance.Maths;

public class countdigits {

    static int countdigit(int n){
        int res=0;
        while(n>0){
            n=n/10;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int x=9235;
        System.out.println(countdigit(x));
    }
}
