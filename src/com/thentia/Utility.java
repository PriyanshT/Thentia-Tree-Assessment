package com.thentia;

import java.util.ArrayList;

public class Utility {
    /*
    * This method will print the tree from given node
    * It will print the parent and child on console
    * @param root
    */
    public static void printTree(TreeNode root) {
        String s = root.getData() + ": ";

        // Printing all the children of a node
        for (int i = 0; i < root.getChildren().size(); i++) {
            s += root.getChildren().get(i).getData() + " ";
        }

        System.out.println(s);

        // Recursively printing till the leaf node
        for (int i = 0; i < root.getChildren().size(); i++) {
            printTree(root.getChildren().get(i));
        }
    }

    /*
     * This method will create the whole tree from the list of pairs
     * It will run recursively until all the pair values are assigned to tree
     * @param edgePairs ArrayList of EdgePair is the first parameter
     * @param root second parameter
     * @return TreeNode This returns the root node of the tree
     */
    public static TreeNode generateTree(ArrayList<EdgePair> edgePairs, TreeNode root) {
        ArrayList<EdgePair> unprocessedEdgePairs = new ArrayList<>();

        for (int i = 0; i < edgePairs.size(); i++) {
            // Storing each values of the pairs
            TreeNode firstValue = edgePairs.get(i).getFirst();
            TreeNode lastValue = edgePairs.get(i).getLast();

            // Checking if root node is present in the pair
            if(firstValue.getData() == root.getData() || lastValue.getData() == root.getData()){
                // Adding the pair associated with root node to child
                if(firstValue.getData() == root.getData()){
                    root.getChildren().add(lastValue);
                } else {
                    root.getChildren().add(firstValue);
                }
            }
            else {
                // Storing in new ArrayList if root not found
                unprocessedEdgePairs.add(edgePairs.get(i));
            }
        }

        // Recursively checking till the ArrayList is empty
        while (!unprocessedEdgePairs.isEmpty()){
            ArrayList<EdgePair> tempEdgePairs = new ArrayList<>(unprocessedEdgePairs);
            unprocessedEdgePairs.clear(); // Emptying the list before manipulation

            // Changing the root node to check further
            for (int i = 0; i < root.getChildren().size(); i++) {
                generateTree(tempEdgePairs, root.getChildren().get(i));
            }
        }

        return root;
    }
}
