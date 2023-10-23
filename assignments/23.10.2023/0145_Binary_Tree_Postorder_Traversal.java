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
    public List<Integer> postorderTraversal(TreeNode root) {
        return traversal(new ArrayList<Integer>(), root);
    }
    public static List<Integer> traversal(List<Integer> ans, TreeNode root){
        if(root == null) return new ArrayList<Integer>();
        traversal(ans,root.left);
        traversal(ans,root.right);
        ans.add(root.val);
        return ans;
    }
}