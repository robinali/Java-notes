class Solution {
    // 161
    // Reference: cspiration
    public boolean isOneEditDistance(String s, String t) {
        // Time: O(n^2) Space: O(1)
        for(int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if(s.charAt(i) != t.charAt(i)) {
                if(s.length() == t.length()) {
                    return s.substring(i+ 1).equals(t.substring(i + 1));
                } else if(s.length() > t.length()) {
                    return s.substring(i + 1).equals(t.substring(i));
                } else {
                    return t.substring(i + 1).equals(s.substring(i));
                }
            }
        }
        return Math.abs(s.length() - t.length()) == 1;
    }
}