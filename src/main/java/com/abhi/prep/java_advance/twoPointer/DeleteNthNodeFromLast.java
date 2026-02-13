package com.abhi.prep.java_advance.twoPointer;

import java.util.LinkedList;
import java.util.List;

import static com.abhi.prep.java_advance.twoPointer.ListNode.insert;
import static com.abhi.prep.java_advance.twoPointer.ListNode.printList;

public class DeleteNthNodeFromLast {

    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        int nodecount=0;
        ListNode traverse=head;
        while(traverse!=null){
            nodecount+=1;
            traverse=traverse.next;
        }
        int deletenode=nodecount-n+1;

        ListNode prev=dummy;
        ListNode cur=head;

        int i=0;
        while(i<deletenode-1){
            cur=cur.next;
            prev=prev.next;
            i++;
        }
        prev.next=cur.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = null;

        // Insert elements
        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        head = insert(head, 40);
        head = insert(head, 50);

        System.out.println("Original List:");
        printList(head);

        // Remove 2nd node from end
        head = removeNthFromEnd(head, 2);

        System.out.println("After Removing 2nd Node From End:");
        printList(head);
    }

}
