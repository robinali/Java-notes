class Solution {
    // 217
    // Reference: cspiration
    public boolean containsDuplicate(int[] nums) {
        // Time: O(nlogn) Sapce: O(1)
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) return true;
        }
        return false;
    }
}