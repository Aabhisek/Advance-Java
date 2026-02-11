/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 */


package com.abhi.prep.java_advance.twoPointer;

public class validpalindromeII_680 {

    static boolean helper(int i,int j, String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean validPalindrome(String s) {

        int i=0;
        int j=s.length()-1;
        while(i<j){

            char left=s.charAt(i);
            char right=s.charAt(j);

            if(left!=right){

                return helper(i+1,j,s) || helper(i,j-1,s);

            }else {
                i++;
                j--;
            }

        }
    return true;
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(validPalindrome(s));

    }

}
