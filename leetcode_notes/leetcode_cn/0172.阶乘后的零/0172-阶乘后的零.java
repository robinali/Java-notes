class Solution {
    // 172
    // Reference: cspiration
    public int trailingZeroes(int n) {
        // Time: O(logn) Space: O(n)
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}