class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
	int n = matrix.length;
	if(n == 0) return false;
	int m = matrix[0].length;
	if(m == 0) return false;

    int i = n - 1, j = 0;
    while( i >= 0 && j <= m - 1) {
        if (matrix[i][j] > target) {
            i--;
        } else if (matrix[i][j] < target) {
            j++;
        } else {
            return true;
        }
    }
    return false;
     }
}
