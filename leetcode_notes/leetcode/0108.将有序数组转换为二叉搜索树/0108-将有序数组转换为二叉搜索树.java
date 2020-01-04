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
    // 108
    // Reference: leetcode caikehe
    // https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/discuss/35356/Java-dfs-solution.
    // Time O(n) Space: O(n)
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        return sortedArrayToBST( nums, 0, nums.length );
    }
    
    private TreeNode sortedArrayToBST(int[] nums, int start, int len) {
        if(len == 0) return null;
        int half = len / 2;
        TreeNode node = new TreeNode( nums[start + half] );
        node.left = sortedArrayToBST(nums, start, half);
        node.right = sortedArrayToBST(nums, start + half + 1, len - half - 1);
        return node;
    }
}