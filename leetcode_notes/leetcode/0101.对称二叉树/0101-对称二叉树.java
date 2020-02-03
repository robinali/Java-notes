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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode l = queue.poll();
            TreeNode r = queue.poll();
            if(l == null && r == null) continue;
            if(l == null || r == null) return false;
            if(l.val != r.val) return false;
            queue.add(l.left);
            queue.add(r.right);
            queue.add(l.right);
            queue.add(r.left);
        }
        return true;
    }
}