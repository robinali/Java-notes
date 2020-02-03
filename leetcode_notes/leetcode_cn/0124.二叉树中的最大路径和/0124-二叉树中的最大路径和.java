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
    // Time: O(n) Space: O(n)
    int res;
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        res = Integer.MIN_VALUE;
        findPath(root);
        return res;
    }
    private int findPath(TreeNode root) {
        if(root == null) return 0;
        int left = Math.max(0, findPath(root.left));
        int right = Math.max(0, findPath(root.right));
        res = Math.max(res, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}