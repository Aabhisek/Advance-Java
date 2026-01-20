package com.abhi.prep.java_advance.StackAndQueue;


public class CustomStack {


    //using private because no other class can see them and change them directly
    // only this class can see them and allowed to change

    private int[] arr; //to store the data
    private int top;    //to track the peek element
    private int capacity;   //tell how many items can this stack hold

    public CustomStack(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        top=-1;
    }

    public void push(int value){
        if(top==capacity-1){
            System.out.println("stack overflow");
            return;
        }
        arr[++top]=value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int size(){
        return top+1;
    }

}
