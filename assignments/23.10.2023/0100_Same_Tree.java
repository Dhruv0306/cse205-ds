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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){// Reached at the end of either or both Tree.
            return p == q;
        }
        TreeNode leftp = p.left, leftq = q.left, rightp = p.right, rightq = q.right;// Find left and right TreeNodes of q and q
        int valP = p.val, valQ = q.val;// Store current values of p and q roots

        // Check if the roots & left Tree & right Tree are same or not
        boolean ans = ((valP == valQ)&& isSameTree(leftp,leftq) && isSameTree(rightp,rightq));
        return ans; 
    }
}