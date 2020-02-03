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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        pathSum(root, sum, new ArrayList<>(), res);
        return res;
    }
    
    private void pathSum(TreeNode node, int sum, List<Integer> out, List<List<Integer>> res) {
        if(node == null) return;
        out.add(node.val);
        if(sum == node.val && node.left == null && node.right == null) {
            res.add(new ArrayList<>(out));
        }
        pathSum(node.left, sum - node.val, out, res);
        pathSum(node.right, sum - node.val, out, res);
        out.remove(out.size() -1);
    }
}