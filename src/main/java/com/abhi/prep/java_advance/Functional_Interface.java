package com.abhi.prep.java_advance;


import ch.qos.logback.core.net.SyslogOutputStream;

@FunctionalInterface
interface A{
    int add(int i,int j);

}

public class Functional_Interface {

    public static void main(String[] args) {

        A obj= ( i,j) -> i+j;
        int result=obj.add(5,6);
        System.out.println(result);

    }
}
