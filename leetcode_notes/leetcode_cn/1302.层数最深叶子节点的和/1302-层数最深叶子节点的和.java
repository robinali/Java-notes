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
    private int sum;
    private int maxLevel;

    public int deepestLeavesSum(TreeNode root) {
        sum = 0;
        maxLevel = 0;
        deepestLeavesSum(root, 0);
        return sum;
    }
    public void deepestLeavesSum(TreeNode root, int level) {
        if(root == null) return;
        if(level == maxLevel) sum += root.val;
        if(level > maxLevel) {
            sum = root.val;
            maxLevel = level;
        }
        deepestLeavesSum(root.left, level + 1);
        deepestLeavesSum(root.right, level + 1);
    }
}