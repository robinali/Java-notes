class Solution {
    // Reference: huahua
    // Time: O(4^mn) Space: O(m * n)
    public int uniquePathsIII(int[][] grid) {
        int sx = -1, sy = -1, n = 1;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 0) n++;
                else if (grid[i][j] == 1) {
                    sx = j;
                    sy = i;
                }
            }
        }
        return dfs(grid, sx, sy, n);
    }
    
    private int dfs(int[][] grid, int x, int y, int n) {
        if(x < 0 || x == grid[0].length ||
           y < 0 || y == grid.length ||
           grid[y][x] == -1) {
            return 0;
        }
        if(grid[y][x] == 2) {
            return n == 0 ? 1 : 0;
        }
        grid[y][x] = -1;
        int paths = dfs(grid, x + 1, y, n - 1) +
            dfs(grid, x - 1, y, n - 1) +
            dfs(grid, x, y + 1, n - 1) +
            dfs(grid, x, y - 1, n - 1);
        grid[y][x] = 0;
        return paths;
    }
}