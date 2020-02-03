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
    private int depth = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        maxDepth(root, 1); 
        return this.depth;
    }
    
    private void maxDepth(TreeNode root, int c_depth) {
        if((root == null) || (root.left == null && root.right == null)){
            depth = Math.max(depth, c_depth);
        }
        if(root.left != null)
            maxDepth(root.left, c_depth + 1);
        if(root.right != null)
            maxDepth(root.right, c_depth + 1);
    }
}