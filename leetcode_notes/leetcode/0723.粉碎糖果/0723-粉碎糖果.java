class Solution {    
    public int[][] candyCrush(int[][] board) {
        boolean redo = false;
        for(int i = board.length - 1; i >= 0; i--) {
            for(int j = board[0].length - 1; j >= 0; j--) {
                int v = Math.abs(board[i][j]);
                if(v > 0 && j > 1 && v == Math.abs(board[i][j - 1]) && v == Math.abs(board[i][j - 2])) {
                    board[i][j] = board[i][j - 1] = board[i][j - 2] = -v;
                    redo = true;
                }
                if(v > 0 && i > 1 && v == Math.abs(board[i - 1][j]) && v == Math.abs(board[i - 2][j])) {
                    board[i][j] = board[i - 1][j] = board[i - 2][j] = -v;
                    redo = true;
                }
            }
        }
        
        for(int j = 0; j < board[0].length; j++) {
            int idx = board.length - 1;
            for(int i = idx; i >= 0; i--) {
                if(board[i][j] >= 0) {
                    board[idx--][j] = board[i][j];
                }
            }
            for(int i = idx; i >= 0; i--) {
                board[i][j] = 0;
            }
        }
        return redo? candyCrush(board) : board;
    }
}