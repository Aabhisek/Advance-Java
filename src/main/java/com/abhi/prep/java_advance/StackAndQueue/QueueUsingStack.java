package com.abhi.prep.java_advance.StackAndQueue;

import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first;
    private  Stack<Integer> second;

    public QueueUsingStack(){
        first=new Stack<>();
        second=new Stack<>();
    }

    public void enqueue(int item){
        first.push(item);
    }

    public int dequeue(){
        if(second.isEmpty()){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
        return second.pop();
    }

    public int peek() {
        if(second.isEmpty()){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
        return second.peek();
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack q =new QueueUsingStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println(q.empty());

    }

}
