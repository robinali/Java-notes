class Solution {
    // 121
    // Reference: cspiration
    public int maxProfit(int[] prices) {
        // Time: O(n) Space: O(1)
        if(prices == null || prices.length < 2) return 0;
        int min = prices[0];
        int profit = 0;
        for(int price : prices) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }
        return profit;
    }
}