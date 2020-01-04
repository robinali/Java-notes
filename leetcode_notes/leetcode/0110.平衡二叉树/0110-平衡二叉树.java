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
    public boolean isBalanced(TreeNode root) {
        // Time O(n) Space O(n)
        if(root == null) return true;
        return levelCheck(root) != -1;
    }
    private int levelCheck(TreeNode root) {
        if(root == null) return 0;
        int l = levelCheck(root.left);
        int r = levelCheck(root.right);
        if(l == -1 || r == -1 || Math.abs(l - r) > 1)  {
            return -1;
        }
        return Math.max(l,r) + 1;
    }
}