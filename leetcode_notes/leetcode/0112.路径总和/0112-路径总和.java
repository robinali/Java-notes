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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        
        ArrayDeque<TreeNode> st = new ArrayDeque<>();
        st.push(root);
        
        while(!st.isEmpty()) {
            TreeNode t = st.pop();
            
            if(t.left == null && t.right == null) {
                if(t.val == sum) return true;
            }
            if(t.right != null) {
                t.right.val += t.val;
                st.push(t.right);
            }
            if(t.left != null) {
                t.left.val += t.val;
                st.push(t.left);
            }
        }
        return false;
    }
}