class Solution {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        // can do trade everyday
        if(k >= len / 2) return maxProfit(prices);
        
        int[][] dp = new int[k + 1][len];
        for(int i = 1; i <= k; i++) {
            int tmpMax = -prices[0];
            for(int j = 1; j < len; j++) {
                dp[i][j] = Math.max(dp[i][j-1], prices[j] + tmpMax);
                tmpMax = Math.max(tmpMax, dp[i - 1][j - 1] - prices[j]);
            }
        }
        return dp[k][len-1];
    }
    
    private int maxProfit(int[] prices) {
        int res = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
}