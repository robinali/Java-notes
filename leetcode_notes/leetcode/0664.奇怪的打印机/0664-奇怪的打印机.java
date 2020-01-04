class Solution {
    // 664
    // Reference: shawngap & myfavcat123 form leetcode
    public int strangePrinter(String s) {
        int n = s.length();
        if(n == 0) return 0;
        
        int[][]dp = new int[n][n];
        for( int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j <= n - i; j++) {
                dp[j][j + i - 1] = i;
                for(int k = j + 1; k < j + i; k++) {
                    int temp = dp[j][k - 1] + dp[k][j + i - 1];
                    if(s.charAt(k) == s.charAt(j)) {
                        temp--;
                    }
                    dp[j][j + i - 1] = Math.min(dp[j][j + i - 1], temp);
                }
            }
        }
        return dp[0][n - 1];
    }
}