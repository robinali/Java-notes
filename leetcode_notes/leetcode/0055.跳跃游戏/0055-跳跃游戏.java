class Solution {
    public boolean canJump(int[] nums) {
        // Time: O(n) Space: O(1)
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > max) return false;
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }
}