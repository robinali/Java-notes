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
    // 95
    // Reference: cspiration
    // Time: O(nˆ2) Space: O(n)
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[] res = new List[n + 1];
        res[0] = new ArrayList<>();
        if(n == 0) return res[0];
        res[0].add(null);
        for(int i = 1; i <= n; i++) {
            res[i] = new ArrayList<>();
            for(int j = 0; j < i; j++) {
                for(TreeNode left : res[j]) {
                    for(TreeNode right : res[i - j - 1]) {
                        TreeNode root = new TreeNode(j + 1);
                        root.left = left;
                        root.right = clone(right, j + 1);
                        res[i].add(root);
                    }
                }
            }
        }
        return res[n];
    }
    
    private TreeNode clone(TreeNode root, int k) {
        if(root == null) return root;
        TreeNode cur = new TreeNode(root.val + k);
        cur.left = clone(root.left, k);
        cur.right = clone(root.right, k);
        return cur;
    }
}