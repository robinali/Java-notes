class Solution {
    // 81
    // Reference: cspiration
    public boolean search(int[] nums, int target) {
        // Time: O(logn) Worst: O(n) Space: O(1)
        if(nums == null || nums.length == 0) return false;
        int start = 0;
        int end = nums.length - 1;
        while(start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if(nums[mid] == target) return true;
            if(nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            } else if(nums[start] <= nums[mid]) {
                if(nums[start] <= target && target <= nums[mid]) end = mid;
                else start = mid;
            } else {
                if(nums[mid] <= target && target <= nums[end]) start = mid;
                else end = mid;
            }
        }
        if(nums[start] == target) return true;
        if(nums[end] == target) return true;
        return false;
    }
}