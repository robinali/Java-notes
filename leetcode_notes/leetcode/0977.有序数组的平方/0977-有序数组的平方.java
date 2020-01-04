class Solution {
    public int[] sortedSquares(int[] A) {
        int l = 0, r = A.length - 1;
        int[] ans = new int[A.length];
        int idx = A.length - 1;
        while(l <= r) {
            int lnum = A[l] * A[l];
            int rnum = A[r] * A[r];
            if(lnum > rnum) {
                ans[idx--] = lnum;
                l++;
            } else {
                ans[idx--] = rnum;
                r--;
            }
        }
        return ans;
    }
}