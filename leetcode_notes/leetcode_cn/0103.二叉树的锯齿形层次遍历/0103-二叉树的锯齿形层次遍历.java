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
    // 103
    // Rederence: cspiration
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Time: O(n) Space: O(n)
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        boolean x = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if(x) {
                    list.add(cur.val);
                } else {
                    list.add(0, cur.val);
                }
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            res.add(list);
            x = x ? false : true;
        }
        return res;
    }
}