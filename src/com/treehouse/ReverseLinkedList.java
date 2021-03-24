package com.treehouse;

public class ReverseLinkedList {

    public static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public static class LinkedList {
        private Node head;
        private int length;

        public LinkedList() {
            this.head = null;
            this.length = 0;
        }

        public Node add(Node node) {
            if(this.head == null) {
                this.head = node;
            }
            else {
                Node currentNode = this.head;
                while(currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = node;
            }
            length++;
            return node;
        }

        @Override
        public String toString() {
            return "LinkedList{" +
                    "head=" + head +
                    ", length=" + length +
                    '}';
        }
    }


    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        LinkedList list = new LinkedList();

        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.add(node5);

        System.out.println(list.toString());
        System.out.println(reverseLinkedList2(list));

        //System.out.println(partialReverseLinkedList(list, 2, 4));
    }

    public static Node reverseLinkedList2(LinkedList list) {
        Node prev = null;
        Node current = list.head;

        while(current != null) {
            Node next = current.next; // save the value we formerly pointed to
            current.next = prev;      // set the pointer to the value behind us
            prev = current;           // set prev to current
            current = next;           // current is going to = the value we saved old pointer value
        }
        return prev;
    }

    public static Node reverseLinkedList(LinkedList list) {
        Node prev = null;;
        Node current = list.head;

        while(current != null) {
            System.out.println("Current: " + current + " Prev: " + prev);
            Node next = current.next; // store our next value here
            current.next = prev;      // set the current values pointer to the previous value
            prev = current;           // set prev to our current -> move the chain
            current = next;           // current = next value we stored above and the process continues
        }
        return prev;
    }


    public static Node partialReverseLinkedList(LinkedList list, int m, int n) {
        return null;
    }
}
