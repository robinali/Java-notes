class NumArray {
    // 207
    // Reference: cspiration
    
    private int[] tree;
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        int sum;
        int lowbit;
        tree = new int[nums.length + 1];
        for(int i = 1; i < tree.length; i++) {
            sum = 0;
            lowbit = i & (-i);
            for(int j = i; j > i - lowbit; j--) {
                sum = sum +nums[j - 1];
            }
            tree[i] = sum;
        }
        
    }
    
    public void update(int i, int val) {
        int diff = val - nums[i];
        nums[i] = val;
        i++;
        for(; i < tree.length; i += (i & (-i))) {
            tree[i] += diff;
        }
    }
    
    public int sumRange(int i, int j) {
        return sum(j + 1) - sum(i);
    }
    
    private int sum(int k) {
        int sum = 0;
        for(int i = k; i > 0; i -= i & (-i)) {
            sum += tree[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */