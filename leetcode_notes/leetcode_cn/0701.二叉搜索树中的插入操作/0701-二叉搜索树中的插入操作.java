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
    public TreeNode insertIntoBST0(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(root.val < val) {
            root.right = insertIntoBST(root.right, val);
        } else {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        TreeNode parent = root, cur = root;
        while(cur != null) {
            parent = cur;
            cur = cur.val < val ? cur.right : cur.left;
        }
        if(parent.val < val) {
            parent.right = new TreeNode(val);
        } else {
            parent.left = new TreeNode(val);
        }
        return root;
    }
}