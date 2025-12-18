package com.abhi.prep.java_advance;


import java.util.Scanner;

public class palindrome {

    static boolean palindrome(int x){
        int original=x;
        int res=0;
        while(x>0){
            res=(res*10)+x%10;
            x=x/10;
        }
        return original==res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(palindrome(x));
    }
}
