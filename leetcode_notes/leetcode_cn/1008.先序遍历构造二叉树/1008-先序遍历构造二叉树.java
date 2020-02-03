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
    public TreeNode bstFromPreorder0(int[] preorder) {
        if(preorder == null || preorder.length == 0) return null;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode rtn = new TreeNode(preorder[0]);
        stack.push(rtn);
        for(int i = 1; i < preorder.length; i++) {
            TreeNode parent = stack.peek();
            if(preorder[i] < parent.val) {
                parent.left = new TreeNode(preorder[i]);
                stack.push(parent.left);
            } else {
                TreeNode cur = stack.pop();
                while(!stack.isEmpty() && stack.peek().val < preorder[i]) {
                    cur = stack.pop();
                }
                cur.right = new TreeNode(preorder[i]);
                stack.push(cur.right);
            }
        }
        return rtn;
    }

    public TreeNode bstFromPreorder1(int[] preorder) {
        return bstFromPreorder1(preorder, 0, preorder.length - 1);
    }
    
    private TreeNode bstFromPreorder1(int[] preorder, int left, int right) {
        if(left > right) return null;

        TreeNode root = new TreeNode(preorder[left]);
        int idx = left + 1;
        while(idx < preorder.length && preorder[idx] < preorder[left]) {
            idx++;
        }
        root.left = bstFromPreorder1(preorder, left + 1, idx - 1);
        root.right = bstFromPreorder1(preorder, idx, right);
        return root;
    }

    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, Integer.MAX_VALUE);
    }

    private TreeNode bstFromPreorder(int[] preorder, int bound) {
        if(i == preorder.length || preorder[i] > bound) return null;
        TreeNode root = new TreeNode(preorder[i++]);
        root.left = bstFromPreorder(preorder, root.val);
        root.right = bstFromPreorder(preorder, bound);
        return root;
    }
}