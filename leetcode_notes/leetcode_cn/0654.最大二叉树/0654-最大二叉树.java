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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length);
    }

    private TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
        if(start >= end) return null;
        int max = nums[start];
        int idx = start;
        for(int i = start + 1; i < end; i++){
            if(nums[i] > max) {
                idx = i;
                max = nums[i];
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = constructMaximumBinaryTree(nums, start, idx);
        root.right = constructMaximumBinaryTree(nums, ++idx, end);

        return root;
    }
}