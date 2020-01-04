class Solution {
    // 137
    // Reference: cspiration
    public int singleNumber(int[] nums) {
        // Time: O(n) Space: O(1)
        int ones = 0, twos = 0;
        for(int i = 0; i < nums.length; i++) {
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }
        return ones;
    }
}