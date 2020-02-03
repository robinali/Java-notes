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
    // Time: O(n) Space: O(n)
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null) return res;
        getPath(res, root, "");
        return res;
    }
    
    private void getPath(List<String> res, TreeNode root, String path) {
        if(root.left == null && root.right == null) {
            res.add(path + root.val);
        }
        if(root.left != null) {
            getPath(res, root.left, path + root.val + "->");
        }
        if(root.right != null) {
            getPath(res, root.right, path + root.val + "->");
        }
    }
}