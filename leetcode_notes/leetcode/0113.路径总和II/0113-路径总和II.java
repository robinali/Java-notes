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
    // 113
    // Reference: cspiration
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        // Time: O(n) Space: O(n)
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        pathSum(res, new ArrayList<>(), root, sum);
        return res;
    }
    
    private void pathSum(List<List<Integer>> res, List<Integer> list, TreeNode root, int sum) {
        if(root == null) return;
        list.add(root.val);
        if(root.left == null && root.right == null) {
            if(sum == root.val) {
                res.add(new ArrayList<>(list));
            }
        }
        pathSum(res, list, root.left, sum - root.val);
        pathSum(res, list, root.right, sum - root.val);
        list.remove(list.size() - 1);
    }
}