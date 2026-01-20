package com.abhi.prep.java_advance.StackAndQueue;

public class main {

    public static void main(String[] args) {
        CustomStack stack1= new CustomStack(5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(5);


        stack1.pop();

        System.out.println(stack1.peek());

    }

}
