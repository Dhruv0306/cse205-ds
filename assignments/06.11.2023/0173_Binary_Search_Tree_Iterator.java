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
class BSTIterator {
    List<TreeNode> inorder = new ArrayList<>();
    int index = 0;

    public BSTIterator(TreeNode root) {
        createInorder(root);
    }
    
    public int next() {
        int val = inorder.get(index).val;
        index++;
        return val;
    }
    
    public boolean hasNext() {
        return (index < inorder.size());
    }

    public void createInorder(TreeNode root){
        if(root == null) return ;
        createInorder(root.left);
        inorder.add(root);
        createInorder(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */