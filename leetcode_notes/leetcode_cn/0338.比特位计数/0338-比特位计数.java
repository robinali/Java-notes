class Solution {
    public int[] countBits(int num) {
        int[] rtn = new int[num + 1];
        for(int i = 1; i <= num; i++) {
            rtn[i] = rtn[i & (i - 1)] + 1;
        }
        return rtn;
    }
}