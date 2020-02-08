class Solution {
    public int arrayPairSum(int[] nums) {
        // Reference: https://leetcode.com/problems/array-partition-i/solution/
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}