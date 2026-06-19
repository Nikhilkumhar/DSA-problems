package com.BinaryTree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x) {val = x;}
}


public class DepthBT {
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1+Math.max(left,right);
    }

    public static void main(String[] args) {
        DepthBT dbt = new DepthBT();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Maximum depth:"+dbt.maxDepth(root));
    }


}
