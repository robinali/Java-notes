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
    // 99
    //Reference: cspiration
    
    public void recoverTree(TreeNode root) {
        // Time: O(n) Space: O(n)
        TreeNode first = null;
        TreeNode second = null;
        TreeNode prev = null;
        
        TreeNode cur = root;
        Deque<TreeNode> stack = new ArrayDeque<>();
        while(!stack.isEmpty() || cur != null) {
            if(cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                if(prev != null && cur.val <= prev.val) {
                    if(first == null) first = prev;
                    second = cur;
                }
                prev = cur;
                cur = cur.right;
            }
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}