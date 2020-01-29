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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return root;
        if(hasOne(root)) {
            return root;
        } else {
            return null;
        }
    }

    private boolean hasOne(TreeNode root) {
        if(root == null) return true;
        if(root.right != null) {
            if(!hasOne(root.right)) root.right = null;
        }
        if(root.left != null) {
            if(!hasOne(root.left)) root.left = null;
        }
        return (root.right != null || root.left != null || root.val == 1);
    }
}