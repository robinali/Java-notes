class Solution {
    // 801
    // Reference: wangzi6147 from leetcode
    public int minSwap(int[] A, int[] B) {
        // Time: O(n) Sapce: O(1)
        if(A == null || B == null || A.length != B.length) return -1;
        int swapRecord = 1, fixRecord = 0;
        for(int i = 1; i < A.length; i ++) {
            if(A[i - 1] >= B[i] || B[i - 1] >= A[i]) {
                // fixRecord = fixRecord
                swapRecord++;
            } else if (A[i - 1] >= A[i] || B[i - 1] >= B[i]) {
                int temp = swapRecord;
                swapRecord = fixRecord + 1;
                fixRecord = temp;
            } else {
                int min = Math.min(swapRecord, fixRecord);
                swapRecord = min + 1;
                fixRecord = min;
            }
        }
        return Math.min(swapRecord, fixRecord);
    }
}