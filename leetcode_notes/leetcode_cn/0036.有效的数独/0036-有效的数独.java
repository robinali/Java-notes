class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board.length != 9 || board[0].length != 9) return false;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.' && !valid(board, i, j)) return false;
            }
        }
        return true;
    }
    
    private boolean valid(char[][] board, int i, int j) {
        for(int row = 0; row < 9; row++) {
            if(row == i) continue;
            if(board[row][j] == board[i][j]) return false;
        }
        for(int col = 0; col < 9; col++) {
            if(col == j) continue;
            if(board[i][col] == board[i][j]) return false;
        }
        for(int row = (i/3) * 3; row < (i/3 + 1) * 3; row++) {
            for(int col = (j/3) *3; col < (j/3 + 1) * 3; col++) {
                if(row == i && col == j) continue;
                if(board[row][col] == board[i][j]) return false;
            }
        }
        return true;
    }
}