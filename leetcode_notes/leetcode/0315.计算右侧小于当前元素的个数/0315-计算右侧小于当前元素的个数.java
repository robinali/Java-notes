class Solution {
    // 315
    // Reference: huahua
    // https://zxi.mytechroad.com/blog/algorithms/array/leetcode-315-count-of-smaller-numbers-after-self/
    
    class Node {
        int val;
        int count;
        int left_count;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
            this.count = 1;
        }
        public int less_or_equal() {
            return count + left_count;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums.length == 0) return ans;
        int n = nums.length;
        Node root = new Node(nums[n - 1]);
        ans.add(0);
        for(int i = n - 2; i >= 0; i--) {
            ans.add(insert(root, nums[i]));
        }
        Collections.reverse(ans);
        return ans;
    }
    
    private int insert(Node root, int val) {
        if(root.val == val) {
            ++root.count;
            return root.left_count;
        } else if(val < root.val) {
            ++root.left_count;
            if(root.left == null) {
                root.left = new Node(val);
                return 0;
            }
            return insert(root.left, val);
        } else {
            if(root.right == null) {
                root.right = new Node(val);
                return root.less_or_equal();
            }
        }
        return root.less_or_equal() + insert(root.right, val);
    }
}