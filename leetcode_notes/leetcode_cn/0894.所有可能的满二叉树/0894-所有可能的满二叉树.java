/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution1 {
    private HashMap<Integer, List<TreeNode>> hm = null;
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> rtn = new ArrayList<>();
        if(N % 2 == 0) return rtn;
        if(N == 1) {
            TreeNode root = new TreeNode(0);
            rtn.add(root);
            return rtn;
        }
        if(hm == null) hm = new HashMap<>();
        for(int i = 1; i < N; i += 2) {
            List<TreeNode> left = hm.getOrDefault(i, null);
            if(left == null) {
                left = allPossibleFBT(i);
                hm.put(i, left);
            }
            List<TreeNode> right = hm.getOrDefault(N - 1 - i, null);
            if(right == null) {
                right = allPossibleFBT(N - 1 - i);
                hm.put(N - 1 - i, right);
            }
            for(TreeNode l : left) {
                for(TreeNode r : right) {
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right = r;
                    rtn.add(root);
                }
            }
        }
        return rtn;
    }
}class Solution {
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> ans = new ArrayList<>();
        if (N % 2 == 0) {
            return ans;
        }
        if (N == 1) {
            TreeNode head = new TreeNode(0);
            ans.add(head);
            return ans;
        }
        for (int i = 1; i < N; i += 2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(N - 1 - i);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode head = new TreeNode(0);
                    head.left = l;
                    head.right = r;
                    ans.add(head);
                }
            }
        }
        return ans;
    }
}