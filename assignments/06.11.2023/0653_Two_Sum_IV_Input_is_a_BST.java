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
    private TreeNode root = null;

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        // remember the root node.
        if (this.root == null) {
            this.root = root;    
        }

        if (findTarget(this.root, k - root.val, root)) {
            return true;
        }

        return findTarget(root.left, k) || findTarget(root.right, k);
    }

    private boolean findTarget(TreeNode node, int target, TreeNode currentNode) {
        if (node == null) {
            return false;
        }

        if (node.val == target) {
            return node != currentNode;
        }

        return findTarget(node.val < target ? node.right : node.left, target, currentNode);
    }
}