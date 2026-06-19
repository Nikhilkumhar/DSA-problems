package com.BinaryTree;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int x) {
        val = x;
    }
}

public class SameT {

    public boolean isSameTree(TreeNode1 p, TreeNode1 q) {

        // If both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // If one node is null and the other is not
        if (p == null || q == null) {
            return false;
        }

        // If values are different
        if (p.val != q.val) {
            return false;
        }

        // Check left and right subtrees
        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

        // First Tree
        TreeNode1 root1 = new TreeNode1(1);
        root1.left = new TreeNode1(2);
        root1.right = new TreeNode1(3);
        root1.left.left = new TreeNode1(4);
        root1.left.right = new TreeNode1(5);

        // Second Tree
        TreeNode1 root2 = new TreeNode1(1);
        root2.left = new TreeNode1(2);
        root2.right = new TreeNode1(3);
        root2.left.left = new TreeNode1(4);
        root2.left.right = new TreeNode1(6);

        SameT obj = new SameT();

        boolean result = obj.isSameTree(root1, root2);

        System.out.println("Are trees same? " + result);
    }
}