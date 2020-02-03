class Solution {
    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] rtn = new int[n][n];
        int num = 1, tar = n * n;
        while( num <= tar) {
            for(int i = l; i <= r; i++) rtn[t][i] = num++;
            t++;
            for(int i = t; i <= b; i++) rtn[i][r] = num++;
            r--;
            for(int i = r; i >= l; i--) rtn[b][i] = num++;
            b--;
            for(int i = b; i >= t; i--) rtn[i][l] = num++;
            l++;
        }
        return rtn;
    }
}