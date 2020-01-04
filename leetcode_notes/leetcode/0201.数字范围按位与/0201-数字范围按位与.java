class Solution {
    // 201
    // Reference: cspiration
    public int rangeBitwiseAnd(int m, int n) {
        // Time: O(n) ~ O(1)  Space: O(1)
        int offset = 0;
        while(m != n) {
            m >>= 1;
            n >>= 1;
            offset++;
        }
        return m << offset;
    }
}