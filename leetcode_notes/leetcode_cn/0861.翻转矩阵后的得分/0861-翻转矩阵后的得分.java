class Solution {
    public int matrixScore(int[][] A) {
        int rLen = A.length, cLen = A[0].length;
        int rtn = 0;
        for(int c = 0; c < cLen; c++) {
            int col = 0;
            for(int r = 0; r < rLen; r++) {
                col += A[r][c] ^ A[r][0];
            }
            rtn += Math.max(col, rLen - col) * (1 << (cLen - 1 - c));
        }
        return rtn;
    }
}