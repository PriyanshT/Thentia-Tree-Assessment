package com.thentia;

public class EdgePair {
    private TreeNode first;
    private TreeNode last;

    EdgePair(TreeNode first, TreeNode last){
        this.first = first;
        this.last = last;
    }

    // getters for first and last TreeNode
    public TreeNode getFirst() {
        return first;
    }

    public TreeNode getLast() {
        return last;
    }
}
