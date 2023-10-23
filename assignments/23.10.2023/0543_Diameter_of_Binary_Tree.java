/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        diameter(root);
        return diameter - 1;
    }

    public static int diameter(TreeNode root){
        if(root == null) return 0;
        
        int leftL = diameter(root.left);
        int rightL = diameter(root.right);
        diameter = Math.max(diameter, leftL + rightL + 1);

        return Math.max(leftL,rightL)+1;
    }
}