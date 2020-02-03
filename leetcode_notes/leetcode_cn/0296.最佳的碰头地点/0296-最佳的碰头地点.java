class Solution {
    public int minTotalDistance(int[][] grid) {
        // Time: O(m * n) Space: O(n)
        int m = grid.length, n = grid[0].length;
        List<Integer> I = new ArrayList<>();
        List<Integer> J = new ArrayList<>();
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    I.add(i);
                }
            }
        }
        
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < m; i++) {
                if(grid[i][j] == 1) {
                    J.add(j);
                }
            }
        }
        return min(I) + min(J);
    }
    
    private int min(List<Integer> list) {
        int i = 0, j = list.size() - 1, sum = 0;
        while(i < j) {
            sum += list.get(j--) - list.get(i++);
        }
        return sum;
    }
}