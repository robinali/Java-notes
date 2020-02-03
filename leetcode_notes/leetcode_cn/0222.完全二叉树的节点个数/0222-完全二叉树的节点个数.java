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
    // 222
    // Reference: cspiration
    public int countNodes(TreeNode root) {
        // Time: O(logn * logn) Space: O(logn)?
        if(root == null) return 0;
        TreeNode left = root, right = root;
        int height = 0;
        while(right != null) {
            left = left.left;
            right = right.right;
            height++;
        }
        if(left == null) return (1 << height) - 1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}