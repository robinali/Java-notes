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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inorder(root1, list1);
        inorder(root2, list2);

        return merge(list1, list2);
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if(node == null) return;

        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    private List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> rtn = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int idx1 = 0, idx2 = 0;
        while(idx1 < size1 && idx2 < size2) {
            int num1 = list1.get(idx1);
            int num2 = list2.get(idx2);
            if(num1 < num2) {
                rtn.add(num1);
                idx1++;
            } else {
                rtn.add(num2);
                idx2++;
            }
        }
        while(idx1 < size1) {
            rtn.add(list1.get(idx1++));
        }
        while(idx2 < size2) {
            rtn.add(list2.get(idx2++));
        }
        return rtn;
    }
}