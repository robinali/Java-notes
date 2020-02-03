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
    public TreeNode searchBST0(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        if(root.val < val) return searchBST(root.right, val);
        else return searchBST(root.left, val);
    }

    public TreeNode searchBST(TreeNode root, int val) {
        Stack<TreeNode> stack = new Stack();
        if(root != null) {
            stack.push(root);
            while(!stack.isEmpty()) {
                TreeNode node = stack.pop();
                if(node.val == val) return node;
                else if(node.right != null && node.val < val) stack.push(node.right);
                else if(node.left != null && node.val > val) stack.push(node.left);
            }
        }
        return null;
    }
}