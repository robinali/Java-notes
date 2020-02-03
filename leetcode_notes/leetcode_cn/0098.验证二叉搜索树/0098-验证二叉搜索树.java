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
    // 98
    // Reference: cspiration
    public boolean isValidBST(TreeNode root) {
        // Time: O(n) Sapce: O(n)
        if(root == null) return true;
        return validate(root, null, null);
    }
    
    private boolean validate(TreeNode root, Integer min, Integer max) {
        if(root == null) return true;
        if(min != null && root.val <= min) return false;
        if(max != null && root.val >= max) return false;
        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }
}