class Solution {
    // 214
    // Reference: cspiration
    public String shortestPalindrome(String s) {
        // Time: O(n^2) Space: O(1)
        int i = 0, j = s.length() - 1;
        int end = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                i = 0;
                end--;
                j = end;
            }
        }
        return new StringBuilder(s.substring(end + 1)).reverse().toString() + s;
    }
}