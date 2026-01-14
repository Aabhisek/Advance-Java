package com.abhi.prep.java_advance.Java8Code;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInString {

    public static void main(String[] args) {

        String string="java";

        //converting the string to stream of characters.Each character is represented by its ascii value

        Map<Character, Long> frequencyMap =string.chars()
                                                .mapToObj(c-> (char) c) //now we are converting int again into character
                                                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        //groupingby groups the elements by character itselfs

        System.out.println(frequencyMap);

    }
}
