package com.abhi.prep.java_advance.StackAndQueue;

import java.util.Stack;

public class BalancedParanthesis {

    static boolean checkparanthesis(String s){

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);

           if(ch=='(' || ch=='{' || ch=='['){
               stack.push(ch);
           } else if (ch==')' || ch==']' || ch=='}') {
               if(stack.isEmpty()){
                   return false;
               }

               else{
                   if(ch==stack.peek()){
                       stack.pop();
                   }
               }
           }
        }
        if(!stack.isEmpty()){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s="{[()]}";
    }
}
