class Solution {
    // 72
    // Reference: cspiration
    // DP 2D array m *n
    // If match: dp[i][j] = dp[i - 1][j - 1]
    // Not match:
    // insert: dp[i][j] = dp[i - 1][j - 1] + 1
    // replace: dp[i][j] = dp[i - 1][j - 1] + 1
    // delete: dp[i][j] = dp[i - 1][j] + 1
    /*
        h o r s e
      0 1 2 3 4 5
    r 1 1 2 2 3 4
    o 2 2 1 2 3 4
    s 3 3 4 2 2 3
    */
    public int minDistance(String word1, String word2) {
        // Time: O(m*n) Space: O(m * n)
        int len1 = word1.length();
        int len2 = word2.length();
        
        int[][] dp = new int[len1 + 1][len2 + 1];
        for(int i = 1; i <= len1; i++) {
            dp[i][0] = i;
        }
        for(int j = 1; j <= len2; j++) {
            dp[0][j] = j;
        }
        for(int i = 1; i <= len1; i++) {
            for(int j = 1; j <= len2; j++) {
                if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else{
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1] + 1, dp[i - 1][j] + 1), dp[i - 1][j - 1] + 1);
                }
            }
        }
        return dp[len1][len2];
    }
}