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
    public List<Integer> preorderTraversal(TreeNode root) {  
        List<Integer> rtn = new ArrayList<>();
        if(root == null) return rtn;
        
        preorderTraversal(root, rtn);
        return rtn;
    }
    
    private void preorderTraversal(TreeNode root, List<Integer> rtn) {
        if(root != null) {
            rtn.add(root.val);
            preorderTraversal(root.left, rtn);
            preorderTraversal(root.right, rtn);
        }
    }
}