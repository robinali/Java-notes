class Solution {
    public int totalNQueensHack(int n) {
                int[] rs = new int[]{0,1,0,0,2,10,4,40,92,352,724,2680};
        return rs[n];
    }

    private int count = 0;
    public int totalNQueens(int n) {
        if(n < 1) return 0;
        totalNQueens(0, 0, 0, 0, n);
        return count;
    }

    private void totalNQueens(int row, int col, int ld, int rd, int n) {
        if(row >= n) {
            count++;
            return;
        }
        int bit = (~(col | ld | rd)) & ((1 << n) - 1);
        while(bit > 0) {
            int p = bit & -bit;
            totalNQueens(row + 1, col | p, (ld | p) << 1, (rd | p) >> 1, n);
            bit &= (bit - 1);
        }
    }
}