class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int idx = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0 || A[i] == 0){ 
                if (i > idx) {
                    int tmp = A[idx];
                    A[idx] = A[i];
                    A[i] = tmp;                
                }
                idx++;
            }          
        }
        return A;
    }
}