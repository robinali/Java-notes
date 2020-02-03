class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int offset = 0;
        while(m != n) {
            m >>= 1;
            n >>= 1;
            offset += 1;
        }
        return m << offset;
    }
}