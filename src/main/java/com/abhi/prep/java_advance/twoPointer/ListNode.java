package com.abhi.prep.java_advance.twoPointer;

public class ListNode{
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = next;
    }
    //insert node
    public static ListNode insert(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            return newNode;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }
    // Print LinkedList
    public static void printList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
