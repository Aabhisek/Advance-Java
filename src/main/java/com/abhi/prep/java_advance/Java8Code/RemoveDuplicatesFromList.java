package com.abhi.prep.java_advance.Java8Code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        List<String> ListofStrings= Arrays.asList("Java", "Python", "Swift", "Java", "React");
        List<String> UniqueNumbers= ListofStrings.stream().distinct().collect(Collectors.toList());

        System.out.println(UniqueNumbers);
    }
}
