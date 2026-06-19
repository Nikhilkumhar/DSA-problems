package com.BinaryTree;



public class BuildTree {

    static int index = 0;

    public static TreeNode buildTree(int[] arr) {

        if (index >= arr.length || arr[index] == -1) {
            index++;
            return null;
        }

        TreeNode root = new TreeNode(arr[index++]);

        root.left = buildTree(arr);
        root.right = buildTree(arr);

        return root;
    }

    public static void preorder(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void main() {

        int[] arr = {1, 2, -1, -1, 3, -1, -1};

        TreeNode root = buildTree(arr);

        System.out.print("Preorder: ");
        preorder(root);
    }
}
