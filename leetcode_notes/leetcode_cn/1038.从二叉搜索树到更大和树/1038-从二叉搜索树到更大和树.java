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
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null) return root;
        bstToGstSum(root);
        return root;
    }
    private void bstToGstSum(TreeNode root) {
        if(root.right != null) bstToGstSum(root.right);
        sum += root.val;
        root.val = sum;
        if(root.left != null) bstToGstSum(root.left); 
    }
}