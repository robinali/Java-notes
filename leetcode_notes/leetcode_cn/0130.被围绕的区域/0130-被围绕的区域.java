class Solution {
    // 130
    // Reference: cspiration
    class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public void solve(char[][] board) {
        // Time: O(m + n) Space: O(n)
        if(board == null || board.length == 0 || board[0].length == 0) return;
        
        int m = board.length - 1;
        int n = board[0].length - 1;
        Queue<Point> queue = new LinkedList<>();
        
        // get all 'O's on the edge first
        for(int r = 0; r <= m; r++) {
            if(board[r][0] == 'O') {
                board[r][0] = '1';
                queue.add(new Point(r, 0));
            }
            if(board[r][n] == 'O') {
                board[r][n] = '1';
                queue.add(new Point(r, n));
            }
        }
        for(int j = 0; j < n; j++) {
            if(board[0][j] == 'O') {
                board[0][j] = '1';
                queue.add(new Point(0, j));
            }
            if(board[m][j] == 'O') {
                board[m][j] = '1';
                queue.add(new Point(m, j));
            }
        }
        
        while(!queue.isEmpty()) {
            Point p = queue.poll();
            int row = p.x;
            int col = p.y;
            if(row - 1 >= 0 && board[row - 1][col] == 'O') {
                board[row - 1][col] = '1';
                queue.add(new Point(row - 1, col));
            }
            if(row + 1 < m && board[row + 1][col] == 'O') {
                board[row + 1][col] = '1';
                queue.add(new Point(row + 1, col));
            }
            if(col - 1 >= 0 && board[row][col - 1] == 'O') {
                board[row][col - 1] = '1';
                queue.add(new Point(row, col - 1));
            }
            if(col + 1 < n && board[row][col + 1] == 'O') {
                board[row][col + 1] = '1';
                queue.add(new Point(row , col + 1));
            }            
        }
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == '1') board[i][j] = 'O';
            }
        }
    }
}