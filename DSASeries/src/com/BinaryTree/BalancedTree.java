package com.BinaryTree;



public class BalancedTree {

    static int idx = -1;

    public static TreeNode buildTree(int[] arr) {
        idx++;
        if (arr[idx] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(arr[idx]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);

        return root;
    }

    public static int MaxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = MaxDepth(root.left);
        int right = MaxDepth(root.right);

        if (left == -1 || right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        return MaxDepth(root) != -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, -1, -1, -1};

        TreeNode root = buildTree(arr);

        BalancedTree obj = new BalancedTree();

        System.out.println(obj.isBalanced(root));
    }
}

