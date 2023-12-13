/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == Math.min(p.val,q.val))return root;

        if(findTarget(root.left,Math.min(p.val,q.val),root) && findTarget(root.left,Math.max(p.val,q.val),root))return root;

        if(root.val < Math.min(p.val,q.val))return lowestCommonAncestor(root.right,p,q);
        else return lowestCommonAncestor(root.right,p,q);
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