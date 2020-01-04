class Solution {
    public int jump(int[] nums) {
        // Time O(n) Space O(1)
        if(nums == null || nums.length < 2) return 0;
        int level = 0;
        int curMaxArea = 0;
        int maxNext = 0;
        int i = 0;
        while(curMaxArea - i + 1 > 0){
            level++;
            for(; i <= curMaxArea; i++) {
                maxNext = Math.max(maxNext, nums[i] + i);
                if(maxNext >= nums.length - 1) {
                    return level;
                }
            }
            curMaxArea = maxNext;
        }
        return 0;
    }
}