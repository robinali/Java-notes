class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int n = A.length;
        if (n <= 3) return false;
        
        int total = 0;
        for (int i : A) {
            total += i;
        }
        if (total % 3 != 0) return false;
        int sum = total / 3;
        
        int i = -1, j = -1, current_sum = 0;
        for (int idx = 0; idx < n - 1; idx ++) {
            current_sum += A[idx];
            if(current_sum == sum) {
                i = idx;
            }
            if(current_sum == sum * 2) {
                j = idx;
                if(j > i && i >= 0)
                    return true;
            }
        }
        return false;
    }
}