class Solution {
    // 198
    // Reference: cspiration
    public int rob(int[] nums) {
        // Time: O(n) Space: O(1)
        int prevNo = 0;
        int prevYes = 0;
        for(int num : nums) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = num + temp;
        }
        return Math.max(prevNo, prevYes);
    }
}