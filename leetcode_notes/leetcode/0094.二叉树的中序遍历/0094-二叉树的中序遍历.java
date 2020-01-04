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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rtn = new ArrayList<>();
        if(root == null) return rtn;
        inorderTraversal(root, rtn);
        return rtn;
    }
    
    private void inorderTraversal(TreeNode root, List<Integer> rtn) {
        if(root == null) return;
        inorderTraversal(root.left, rtn);
        rtn.add(root.val);
        inorderTraversal(root.right, rtn);
    }
}