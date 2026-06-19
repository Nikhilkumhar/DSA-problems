package com.BinaryTree;


public class DiameterBinary {


    static void main() {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(7);
        DiameterBinary obj = new DiameterBinary();

        int diameter = obj.diameterOfBinaryTree(root);

        System.out.println("Diameter of Binary Tree = " + diameter);
    }

    private int height(TreeNode node) {
        if (node == null)
            return 0;

        return 1 + Math.max(height(node.left), height(node.right));
    }

    // Diameter (Brute Force)
    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int currentDiameter = leftHeight + rightHeight;

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(currentDiameter,
                Math.max(leftDiameter, rightDiameter));
    }
}