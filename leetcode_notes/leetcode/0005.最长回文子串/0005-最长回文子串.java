class Solution {
    String res = "";
    public String longestPalindrome(String s) {
        // DP: time : O(n ˆ2) Space : O(nˆ2)
        /**if(s == null || s.length() == 0) return s;
        String res = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int max = 0;
        for(int j = 0; j < s.length(); j++) {
            for(int i = 0; i < s.length(); i++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && ((j - i <= 2) || dp[i + 1][j - 1]);
                if(dp[i][j]) {
                    if(j - i + 1 > max) {
                        max = j - i + 1;
                        res = s.substring(i, j + 1);
                    }
                }
            }
        }
        return res;*/
        
        // Center to two sides, two test cases: aba abba
        // Time: O(n ^ 2), Space: O(1)
        if(s == null || s.length() == 1) return s;
        
        for(int i = 0; i < s.length(); i++) {
            getPalindrome(s, i, i);
            getPalindrome(s, i, i + 1);
        }
        return res;
    }
    
    private void getPalindrome(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        String cur = s.substring(left + 1, right);
        if(cur.length() > res.length()) {
            res = cur;
        }
    }
}