class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        return traversal(new ArrayList<Integer>(), root);
    }
    public static List<Integer> traversal(List<Integer> ans, TreeNode root){
        if(root == null) return new ArrayList<Integer>();
        ans.add(root.val);
        traversal(ans,root.left);
        traversal(ans,root.right);
        return ans;
    }
}