class Solution {
    public int[] sumZero(int n) {
        int[] rtn = new int[n];
        int sum = 0;
        for(int i = 1; i < n; i++){
            rtn[i] = i;
            sum -= i;
        }
        rtn[0] = sum;
        return rtn;
    }
}