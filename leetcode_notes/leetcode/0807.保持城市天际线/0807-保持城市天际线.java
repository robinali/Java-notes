class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int diff = 0;
        if(grid == null || grid.length == 0 || grid[0].length == 0) return diff;
        int[] max_in_row = new int[grid.length];
        int[] max_in_col = new int[grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                max_in_row[i] = Math.max(max_in_row[i], grid[i][j]);
                max_in_col[i] = Math.max(max_in_col[i], grid[j][i]);
            }
            for(int j = 0; j <= i; j++) {
                if(max_in_col[i] < max_in_row[j])
                    diff += max_in_col[i] - grid[i][j];
                else
                    diff += max_in_row[j]- grid[i][j];

                if(max_in_col[j] < max_in_row[i] && i != j)
                    diff += max_in_col[j] - grid[j][i];
                else if(i != j)
                    diff += max_in_row[i] - grid[j][i];
            }
        }
        return diff;
    }
}