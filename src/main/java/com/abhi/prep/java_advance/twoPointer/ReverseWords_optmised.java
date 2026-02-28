package com.abhi.prep.java_advance.twoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWords_optmised {

     static String reverseWordsoptmised(String s) {
            StringBuilder res=new StringBuilder();
            int i = s.length()-1;
            while(i >=0){
                // skip spaces
                while(i >=0 && s.charAt(i) == ' ') {
                    i--;
                }

                // start of word
                int end = i;
                // move till end of word
                while(i >=0 && s.charAt(i) != ' ') {
                    i--;
                }
                int start=i+1;
                // store word
                res.append(s.substring(start, end+1));
                res.append(" ");
            }

            return res.toString().trim();
        }

        public static void main(String[] args) {
            String s="  the sky   is blue  ";
            System.out.println(reverseWordsoptmised(s));
        }
    }


