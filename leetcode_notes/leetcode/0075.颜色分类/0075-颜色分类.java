class Solution {
    // 75
    // Reference: cspiration
    public void sortColors(int[] nums) {
        // Time O(n) Space O(1)
        if(nums == null || nums.length == 0) return;
        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        while(index <= right) {
            if(nums[index] == 0) {
                swap(nums, index++, left++);
            } else if(nums[index] == 1) {
                index++;
            } else {
                swap(nums, index, right--);
            }
        }
    }
    
    private void swap(int[] nums, int i , int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}