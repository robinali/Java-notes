class Solution {
    // Reference: https://leetcode.com/problems/power-of-three/solution/
    public boolean isPowerOfThree1(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
    public boolean isPowerOfThree2(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
    public boolean isPowerOfThree(int n) {
        if(n < 1) return false;
        while(n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}