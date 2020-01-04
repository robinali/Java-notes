class Solution {
    // 70
    // Reference: cspiration
    public int climbStairs(int n) {
        // Time: O(n) Space: O(n)
        if(n <= 1) return 1;
        int[] mem = new int[n + 1];
        mem[0] = 1;
        mem[1] = 1;
        for(int i = 2; i <= n; i++) {
            mem[i] = mem[i - 1] + mem[i - 2];
        }
        return mem[n];
    }
}