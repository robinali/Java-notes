class Solution {
    boolean[][] memo;
    
    public boolean isMatch(String s, String p) {
        // dp
        if  (s == null || p == null) return false;
        memo = new boolean[s.length() + 1][p.length() + 1];
        return dp(0, 0, s, p);
    }
    
    private boolean dp(int i, int j, String text, String pattern) {
        boolean ans;
        
        if(j == pattern.length()) {
            ans = i == text.length();
        } else {
            boolean first_match = (i < text.length() &&
                                  (pattern.charAt(j) == text.charAt(i) ||
                                  pattern.charAt(j) == '.'));
            if(j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                ans = (dp(i, j + 2, text, pattern) || first_match && dp(i + 1, j, text, pattern));
            } else {
                ans = first_match && dp(i + 1, j + 1, text, pattern);
            }
        }
        memo[i][j] = ans ? true : false;
        return ans;
    }
}