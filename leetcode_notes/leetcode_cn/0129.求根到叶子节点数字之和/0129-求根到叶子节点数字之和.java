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
    // 129
    // Reference: cspiration
    public int sumNumbers(TreeNode root) {
        // Time: O(n) Space: O(n)
        return sumNumbers(root, 0);
    }
    
    private int sumNumbers(TreeNode root, int num) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) {
            return num * 10 + root.val;
        }
        return sumNumbers(root.left, num * 10 + root.val) +
            sumNumbers(root.right, num * 10 + root.val);
    }
}