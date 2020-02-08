class Solution {
    // Reference: https://leetcode.com/problems/diagonal-traverse/solution/
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int row = 0, col = 0, direct = 1;
        int[] rtn = new int[n * m];
        int r = 0;
        
        while (row < n && col < m) {
            rtn[r++] = matrix[row][col];
            int new_row = row + (direct == 1 ? -1 : 1);
            int new_col = col + (direct == 1 ? 1 : -1);
            if(new_row < 0 || new_row == n || new_col < 0 || new_col == m) {
                if(direct == 1) {
                    row += (col == m - 1? 1: 0);
                    col += (col < m - 1 ? 1: 0);
                } else {
                    col += (row == n - 1 ? 1: 0);
                    row += (row < n - 1? 1: 0);
                }
                direct = 1 - direct;
            } else {
                row = new_row;
                col = new_col;
            }
        }
        return rtn;
    }
}