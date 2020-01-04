class Solution {
    public String minWindow(String S, String T) {
        // Time: O(m*n) Space: O(1)
        String res = "";
        int minLen = 20001;
        for(int i = 0; i <= S.length() - T.length(); i++) {
            while(i < S.length() && S.charAt(i) != T.charAt(0)) {
                i++;
            }
            int l = find(S.substring(i, Math.min(i + minLen, S.length())), T);
            if(l != -1 && l < minLen) {
                minLen = l;
                res = S.substring(i, i + l);
            }
        }
        return res;
    }
    
    private int find(String S, String T) {
        for(int i = 0, j = 0; i < S.length() && j < T.length();) {
            if(S.charAt(i) == T.charAt(j)) {
                i++;
                j++;
                if(j == T.length()) {
                    return i;
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}