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
    int res = 0;
    public int findTilt(TreeNode root) {
        recursiveFindTile(root);
        return res;
    }
    
    private int recursiveFindTile(TreeNode root) {
        if(root == null) return 0;
        int left = recursiveFindTile(root.left);
        int right = recursiveFindTile(root.right);
        res += Math.abs(left - right);
        return left + right + root.val;
    }
}