package com.treehouse;
import java.util.LinkedList;
import java.util.List;

public class FlattenDoublyLinkedList {
    public static void main(String[] args) {

        Node node = new Node(1);
        node.next = new Node(2);
        System.out.println(node);

        System.out.println(flattenDLL(node));

    }

    public static class Node {
        int value;
        Node next;
        Node prev;
        Node link;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    ", prev=" + prev +
                    ", link=" + link +
                    '}';
        }
    }

    public static Node flattenDLL(Node node) {
        if(node.next == null && node.link == null) return null;

        Node current = node;
        Node child = node;

        while(current.next != null) {
            if(current.link == null) {
                current = current.next;
            }
            else {
                Node tail = current.link;
                while(tail.next != null) {
                    tail = tail.next;
                }
                tail.next = current.next;

                if(tail.next != null) tail.next.prev = tail;

                current.next = current.link;
                current.next.prev = current;
                current.link = null;
            }
        }
        return node;
    }
}

// traverse until we see a link or null.
// then go down the link.
// traverse until we see a link or null.
// if we see a link traverse until we see null;
// if we see null add these values into our flat linked list and continue.
// return flat linked list


// combine list - start at the nextInLine value from prev iteration.. keep iterating
