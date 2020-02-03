class Solution {
    public int singleNumber(int[] nums) {
        int rtn = 0;
        for (int num : nums) {
            rtn ^= num;
        }
        return rtn;
    }
}