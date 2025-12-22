package com.abhi.prep.java_advance.Maths;

import java.util.Scanner;

public class factorial {

    static int factorial(int n){
        int fact=1;
        while(n>=1){
            fact=fact*n*(n-1);
            n=n-2;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(factorial(n));
    }
}
