package com.abhi.prep.java_advance.twoPointer;

import java.util.HashSet;
import java.util.Set;

class Node{
    Node node;
    int data;

    public Node(Node node) {
        this.node = node;
    }
}
public class CycleDetect {

    static boolean detectcycle(Node head){

        Set<Node> visited=new HashSet<>();

        while(head!=null){
            if(visited.contains(head)) return true;
            visited.add(head);
        }

        return false;
    }

}
