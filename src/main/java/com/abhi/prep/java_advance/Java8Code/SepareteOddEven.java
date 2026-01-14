package com.abhi.prep.java_advance.Java8Code;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SepareteOddEven {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        //Map<Boolean, List<Integer>> result =numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        //List<Integer> evennumber=  result.get(true);
        //List<Integer> oddnumber= result.get(false);

        List<Integer> evennumber=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> oddnumber=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());

        System.out.println("even numbers: " +evennumber);
        System.out.println("odd numbers: "+ oddnumber);
    }
}
