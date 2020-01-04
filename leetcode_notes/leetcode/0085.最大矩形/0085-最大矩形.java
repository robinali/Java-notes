class Solution {
    // 85
    // Reference: cspiration
    public int maximalRectangle(char[][] matrix) {
        // Time: O(m * n) Space: O(n)
        if(matrix == null || matrix.length == 0) return 0;
        int n = matrix[0].length;
        int[] height = new int[n + 1];
        height[n] = 0;
        int res = 0;
        
        for(int row = 0; row < matrix.length; row++) {
            Deque<Integer> stack = new ArrayDeque<>();
            for(int i = 0; i <=n; i++) {
                if( i < n) {
                    if(matrix[row][i] == '1') {
                        height[i]++;
                    } else height[i] = 0;
                }
                if(stack.isEmpty() || height[stack.peek()] <= height[i]) {
                    stack.push(i);
                } else {
                    while(!stack.isEmpty() && height[i] < height[stack.peek()]) {
                        int cur = height[stack.pop()] * (stack.isEmpty() ? i : (i - stack.peek() - 1));
                        res = Math.max(res, cur);
                    }
                    stack.push(i);
                }
            }
        }
        return res;
    }
}