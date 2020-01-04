class Solution {
    public int searchInsert(int[] nums, int target) {
        // Time O(logn) Space O(1)
        if(nums == null || nums.length == 0) return 0;
        
        int start = 0;
        int end = nums.length - 1;
        while(start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if(target == nums[mid]) return mid;
            else if (target < nums[mid]) end = mid;
            else start = mid;
        }
        if(target <= nums[start]) {
            return start;
        } else if(target  <= nums[end]) {
            return end;
        } else {
            return end + 1;
        }
    }
}