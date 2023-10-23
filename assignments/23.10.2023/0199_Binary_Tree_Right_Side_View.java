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
    List<List<Integer>> result;
    public List<Integer> rightSideView(TreeNode root) {
        result = new ArrayList<>();
        
        return levelOrder(root);
    }

    public List<Integer> levelOrder(TreeNode root) {
        preOrderSearch(root, 0);
        List<Integer> ans = new ArrayList<>();

        for(List<Integer> i : result){
            ans.add(i.get(i.size() - 1));
        }
        return ans;
    }

    private void preOrderSearch(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (result.size() <= level) {
            // level is 0-indexed
            result.add(new ArrayList<Integer>());
        }
        preOrderSearch(root.left, level+1);
        result.get(level).add(root.val);
        preOrderSearch(root.right, level+1);
    }
}