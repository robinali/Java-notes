class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        boolean[] r = new boolean[n];
        boolean[] c = new boolean[m];
        for(int i = 0; i < indices.length; i++) {
            r[indices[i][0]] = !r[indices[i][0]];
            c[indices[i][1]] = !c[indices[i][1]];
        }
        int rr = 0, cc = 0;
        for(int i = 0; i < r.length; i++) {
            if(r[i]) rr++;
        }
        for(int i = 0; i < c.length; i++) {
            if(c[i]) cc++;
        }
        return rr*m + cc*n - rr*cc * 2;
    }
}