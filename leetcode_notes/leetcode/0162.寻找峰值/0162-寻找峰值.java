class Solution {
    // 162
    // Reference: cspiration
    public int findPeakElement(int[] nums) {
        // Time: O(logn) Space: O(1)
        int start = 0;
        int end = nums.length - 1;
        while(start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if(nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if(nums[start] > nums[end]) return start;
        return end;
    }
}