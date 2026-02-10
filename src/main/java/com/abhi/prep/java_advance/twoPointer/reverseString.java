/*Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 */
package com.abhi.prep.java_advance.twoPointer;

public class reverseString {

    static void reverse(char[] s){

        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverse(s);
        System.out.println(s);

    }
}
