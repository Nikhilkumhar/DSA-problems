package com.linkedlist;

public class DeleteNode {



    Node<Integer> head;
    int size;
    DeleteNode() {
        this.head = null;
        this.size = 0;
    }

    static void main() {


        Node<Integer> first = new Node<>(10);   // Node with data 10
        Node<Integer> second = new Node<>(20);  // Node with data 20
        Node<Integer> third = new Node<>(30);   // Node with data 30
        first.next = second;   // Connect 10 → 20
        second.next = third;   // Connect 20 → 30


        DeleteNode obj = new DeleteNode();
        obj.head = first;   // set head
        obj.size = 3;       // set size correctly
        obj.printList();
        obj.deleteNode(1);
        obj.printList();
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node<Integer> temp = head;
        head = head.next;
        temp.next = null;
        System.out.println("Deletion at head is successful");
        size--;
    }

    public void deleteTail() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            System.out.println("Deletion at tail is successful");
            return;
        }
        Node<Integer> temp = head;
        Node<Integer> prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        System.out.println("Deletion at tail is successful");
        size--;
    }

    public void deleteNode(int position) {
        if (position > size || position <= 0) {
            System.out.println("Wrong input");
            return;
        }
        // head
        if (position == 1) {
            deleteHead();
        } else if (position == size) {
            deleteTail();
        } else {
            int counter = 1;
            Node<Integer> prev = null;
            Node<Integer> temp = head;
            while (counter < position && temp != null) {
                counter++;
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = null;
            size--;
            System.out.println("Deletion successful at position " + position);
        }

    }

    public void printList() {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.println("data is -> " + temp.data);
            temp = temp.next;
        }
    }

}
