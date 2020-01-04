class Solution {
    // 712
    // Reference: zestypanda from leetcode
    // DP
    // Time: O(n * m) Space: O(n)
    public int minimumDeleteSum(String s1, String s2) {
        int[]count = new int[s2.length() + 1];
        for(int j = 1; j <= s2.length(); j++) {
            count[j] = count[j - 1] + s2.charAt(j - 1);
        }
        for(int i = 1; i <= s1.length(); i++) {
            int t1 = count[0];
            count[0] += s1.charAt(i - 1);
            for(int j = 1; j <= s2.length(); j++) {
                int t2 = count[j];
                count[j] = s1.charAt(i - 1) == s2.charAt(j - 1) ? t1 : Math.min(count[j] + s1.charAt(i - 1), count[j - 1] + s2.charAt(j - 1));
                t1 = t2;
            }
        }
        return count[s2.length()];
    }
}