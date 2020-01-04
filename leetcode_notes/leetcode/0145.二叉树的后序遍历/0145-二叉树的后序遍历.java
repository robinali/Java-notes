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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> rtn = new ArrayList<>();
        if(root == null) return rtn;
        postorderTraversal(root, rtn);
        return rtn;
    }
    
    private void postorderTraversal(TreeNode root, List<Integer> rtn) {
        if(root == null) return;
        postorderTraversal(root.left, rtn);
        postorderTraversal(root.right, rtn);
        rtn.add(root.val);
    }
}