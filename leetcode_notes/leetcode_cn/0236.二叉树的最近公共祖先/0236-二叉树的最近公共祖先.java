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
    private TreeNode ans;
    
    private boolean isCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null) return false;
        boolean left = isCommonAncestor(node.left, p, q) ? true : false;
        boolean right = isCommonAncestor(node.right, p, q) ? true : false;
        boolean mid = node == p || node == q ? true : false;
        if((left && mid) ||(right && mid) || (left && right))
            this.ans = node;
        return left || right || mid;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        isCommonAncestor(root, p, q);
        return this.ans;
    }
}