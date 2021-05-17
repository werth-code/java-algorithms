package com.treehouse;

import java.util.HashMap;

public class CopyListRandomPointer {

    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(6);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);
        System.out.println(copyRandomList(head));
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    ", random=" + random +
                    '}';
        }
    }

    public static Node copyRandomList(Node head) {
        if(head == null) return null;
        HashMap<Node, Node> nodeMap = new HashMap<>();

        Node currentNode = head;
        while(currentNode.next != null) {
            nodeMap.put(currentNode, new Node(currentNode.val));
            currentNode = currentNode.next;
        }

        currentNode = head;
        while(currentNode.next != null) {
            nodeMap.get(currentNode).next = nodeMap.get(currentNode.next);
            nodeMap.get(currentNode).random = nodeMap.get(currentNode.random);
            currentNode = currentNode.next;
        }

        return nodeMap.get(head);
    }



}
