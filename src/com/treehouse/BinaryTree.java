package com.treehouse;

public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree(){};
    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    // we start with a node and add the value to either left or right
    public void insert(BinaryTreeNode node, int value) throws Exception {
        try {
            if(value < node.getValue()) { //go down the left path until we can add this node
                if(node.getLeft() == null) node.setLeft(new BinaryTreeNode(value));
                else insert(node.getLeft(), value);
            }
            else { //go down the right side until we can add this value
                if(node.getRight() == null) node.setRight(new BinaryTreeNode(value));
                else insert(node.getLeft(), value);
            }

        } catch (Exception e) {
            System.out.println("Could Not Insert Value");
        }

    }

    @Override
    public String toString() {
        return "root=" + root;

    }
}
