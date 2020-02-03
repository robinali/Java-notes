class Solution {
    // 200
    // Reference: Huahua
    // DFS

    private final List<int[]> DIRECTIONS = Arrays.asList(
    new int[] {0, 1},
    new int[] {0, -1},
    new int[] {1, 0},
    new int[] {-1, 0});
    
    public int numIslands(char[][] grid) {
        // Time: O(mn) Space: O(mn)
        int m = grid.length;
        if(m == 0) return 0;
        int n = grid[0].length;
        if(n == 0) return 0;
        
        int ans = 0;
        for(int y = 0; y < m; y++) {
            for(int x = 0; x < n; x++) {
                if(grid[y][x] == '1') {
                    ans++;
                    dfs(grid, x, y, n, m);
                }
            }
        }
        return ans;
    }
    
    private void dfs(char[][] grid, int x, int y, int n, int m) {
        if(x < 0 || y < 0 || x >= n || y >= m || grid[y][x] == '0') {
            return;
        }
        grid[y][x] = '0';
        
        for(int[] direction : DIRECTIONS) {
            dfs(grid, x + direction[0], y + direction[1], n, m);
        }
    }
}