class Solution {
    public void rotate(int[][] matrix) {
        // Time: O(n*m) Space O(1)
        int n = matrix.length;
        for(int i = 0; i < n / 2 + n % 2; i++) {
            for(int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 -j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}