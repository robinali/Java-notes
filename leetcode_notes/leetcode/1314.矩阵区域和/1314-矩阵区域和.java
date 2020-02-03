class Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        if(mat == null || mat.length == 0 || mat[0].length == 0) return mat;

        int row = mat.length, col = mat[0].length;
        int[][] res = new int[row][col];
        int[][] preSum = new int[row + 1][col + 1];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                preSum[i + 1][j + 1] = preSum[i][j + 1] + preSum[i + 1][j] - preSum[i][j] + mat[i][j];
            }
        }
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                int r1 = Math.max(i - K, 0);
                int c1 = Math.max(j - K, 0);
                int r2 = Math.min(i + K, row - 1);
                int c2 = Math.min(j + K, col - 1);
                res[i][j] = preSum[r2 + 1][c2 + 1] + preSum[r1][c1] - preSum[r1][c2 + 1]- preSum[r2 + 1][c1];
            }
        }
        return res;
    }
}