class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null) return 0;
        if(nums.length <= 2) return nums.length;
        
        int rtn = 2;
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[rtn - 2]) {
                nums[rtn++] = nums[i];
            }
        }
        return rtn;
    }
}