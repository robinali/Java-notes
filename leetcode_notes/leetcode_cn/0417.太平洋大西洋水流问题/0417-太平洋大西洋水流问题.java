class Solution {
    // DFS, reverse look up from two corner, merge connectable results (1 and 2)
    // Time: O(m * n) Space: O(m * n)
    List<int[]> res = new ArrayList<>();
    int[][] visited;
    
    private void dfs(int[][] matrix, int x, int y, int pre, int preval) {
        if(x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length
          || matrix[x][y] < pre || (visited[x][y] & preval) == preval) {
            return;
        }
        visited[x][y] |= preval;
        if(visited[x][y] == 3) res.add(new int[]{x, y});
        dfs(matrix, x + 1, y, matrix[x][y], visited[x][y]);
        dfs(matrix, x - 1, y, matrix[x][y], visited[x][y]);
        dfs(matrix, x, y + 1, matrix[x][y], visited[x][y]);
        dfs(matrix, x, y - 1, matrix[x][y], visited[x][y]);
        
    }
    public List<int[]> pacificAtlantic(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return res;
        visited = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            dfs(matrix, i, 0, Integer.MIN_VALUE, 1);
            dfs(matrix, i, matrix[0].length - 1, Integer.MIN_VALUE, 2);
        }
        for(int i = 0; i < matrix[0].length; i++) {
            dfs(matrix, 0, i, Integer.MIN_VALUE, 1);
            dfs(matrix, matrix.length - 1, i, Integer.MIN_VALUE, 2);
        }
        return res;
    }
}