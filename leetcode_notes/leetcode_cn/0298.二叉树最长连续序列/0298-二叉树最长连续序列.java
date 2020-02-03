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
    // Time O(n) Space O(n)
    private int res = 0;
    public int longestConsecutive(TreeNode root) {
        if(root == null) return 0;
        findLongestConsecutive(root, 0, root.val);
        return res;
    }
    
    private void findLongestConsecutive(TreeNode root, int max, int target) {
        if(root == null) return;
        if(root.val == target) {
            max++;
        } else {
            max = 1;
        }
        res = Math.max(res, max);
        findLongestConsecutive(root.left, max, root.val + 1);
        findLongestConsecutive(root.right, max, root.val + 1);
    }
}