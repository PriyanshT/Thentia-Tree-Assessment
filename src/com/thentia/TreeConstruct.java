package com.thentia;

import java.util.ArrayList;
import java.util.Arrays;

public class TreeConstruct {
    public static void main(String[] args) {
        // Creating all the nodes of the tree
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        // Creating all our pairs for the edges
        EdgePair ep1 = new EdgePair(node4, node5);
        EdgePair ep2 = new EdgePair(node5, node3);
        EdgePair ep3 = new EdgePair(root, node5);
        EdgePair ep4 = new EdgePair(node2, node5);
        EdgePair ep5 = new EdgePair(node2, node7);
        EdgePair ep6 = new EdgePair(node6, node2);

        // Adding edges to the ArrayList
        ArrayList<EdgePair> edgePairs = new ArrayList<>();
        edgePairs.addAll(Arrays.asList(ep1, ep2, ep3, ep4, ep5, ep6));

        // Generating the tree and printing it
        try {
            root = Utility.generateTree(edgePairs, root);
            Utility.printTree(root);
        }
        catch (Exception e){
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }
}
