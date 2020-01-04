class Solution {
    // 136
    // Reference: cspiration
    public int singleNumber(int[] nums) {
        // Time: O(n) Space: O(1)
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}