package com.treehouse;

public class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if(value <= data) {
            if(left == null) left = new Node(value);
            else left.insert(value);
        }
        else {         // value is greater than our data
            if(right == null) right = new Node(value);
            else right.insert(value);
        }
    }

    public boolean contains(int value) {
        if(value == data) return true; // keeps calling until it returns t/f
        else if(value < data) {
            if(left == null) return false;
            else return left.contains(value); // remember to RETURN here.
        }
        else { // value > data
            if(right == null) return false;
            else return right.contains(value);
        }
    }
}
