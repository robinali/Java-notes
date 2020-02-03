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
        if(root == null) return false;
        
        Deque<TreeNode> node_stack = new ArrayDeque<>();
        Deque<Integer> sum_stack = new ArrayDeque<>();
        node_stack.push(root);
        sum_stack.push(sum - root.val);
        
        while(!node_stack.isEmpty()) {
            TreeNode node = node_stack.pop();
            int cur_sum = sum_stack.pop();
            if(node.left == null && node.right == null) {
                if(cur_sum == 0) return true;
            }
            if(node.right != null) {
                node_stack.push(node.right);
                sum_stack.push(cur_sum - node.right.val);
            }
            if(node.left != null) {
                node_stack.push(node.left);
                sum_stack.push(cur_sum - node.left.val);
            }
        }
        return false;
    }
}