class Solution {
    // 69
    // Reference: cspiration
    public int mySqrt(int x) {
        // Time: Unkown Space: O(1)
        long res = x;
        while (res * res > x) {
            res = (res + x /res) / 2;
        }
        return (int) res;
    }
}