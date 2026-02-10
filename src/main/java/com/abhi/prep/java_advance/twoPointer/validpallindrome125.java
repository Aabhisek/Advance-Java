package com.abhi.prep.java_advance.twoPointer;
/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 */
public class validpallindrome125 {
    static boolean checkvalidpal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);

            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }if(!Character.isLetterOrDigit(right)){
                j--;
                continue;
            }
            if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(checkvalidpal(s));

    }
}
