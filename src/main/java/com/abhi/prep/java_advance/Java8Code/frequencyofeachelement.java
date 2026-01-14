package com.abhi.prep.java_advance.Java8Code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyofeachelement {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String,Long> s=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
