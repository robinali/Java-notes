class Solution {
    // 213
    // Reference: cspiration
    public int rob(int[] nums) {
        // Time: O(n) Space: O(1)
        if(nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }
    
    private int rob(int[] nums, int lo, int hi) {
        int prevNo = 0;
        int prevYes = 0;
        for(int i = lo; i <= hi; i++) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = nums[i] + temp;
        }
        return Math.max(prevNo, prevYes);
    }
}