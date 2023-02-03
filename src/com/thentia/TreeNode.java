package com.thentia;

import java.util.ArrayList;

public class TreeNode {
    private int data;
    private ArrayList<TreeNode> children = new ArrayList<>();

    public TreeNode(Integer data){
        this.data = data;
    }

    // getters for data int and children ArrayList
    public int getData() {
        return data;
    }

    public ArrayList<TreeNode> getChildren() {
        return children;
    }
}
