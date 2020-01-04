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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // Time: O(n) Space: O(n)
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        getLevels(res, root, 0);
        return res;
    }
    
    private void getLevels(List<List<Integer>> res, TreeNode root, int level) {
        if(root == null) return;
        if(level >= res.size()) {
            res.add(0, new ArrayList<>());
        }
        res.get(res.size() - level - 1).add(root.val);
        getLevels(res, root.left, level + 1);
        getLevels(res, root.right, level + 1);
    }
}