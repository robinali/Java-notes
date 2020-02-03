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
    List<List<Integer>> levels = new ArrayList<>();
    
    private void levelOrder(TreeNode node, int level){
        if(levels.size() == level)
            levels.add(new ArrayList<Integer>());
        
        levels.get(level).add(node.val);
        
        if(node.left != null)
            levelOrder(node.left, level + 1);
        if(node.right != null)
            levelOrder(node.right, level + 1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return levels;
        levelOrder(root, 0);
        return levels;
    }
}