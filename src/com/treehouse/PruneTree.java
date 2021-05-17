package com.treehouse;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;

public class PruneTree {

    public static void main(String[] args) {

    }

    public static TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        has1(root);
        return root;
    }

    public static boolean has1(TreeNode node) {
        if(node == null) return false;
        boolean left = has1(node.left);
        boolean right = has1(node.right);

        if(!left) node.left = null;
        if(!right) node.right = null;

        return node.val == 1 || left || right;
    }



    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
