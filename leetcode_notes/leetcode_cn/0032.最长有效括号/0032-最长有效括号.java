class Solution {
    public int longestValidParentheses(String s) {
        // Time O(n) Space O(n)
        Deque<Integer> stack = new ArrayDeque<>();
        
        int res = 0;
        int start = -1;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if(stack.isEmpty()) {
                    start = i;
                } else {
                    stack.pop();
                    if(stack.isEmpty()) {
                        res = Math.max(res, i- start);
                    } else {
                        res = Math.max(res, i - stack.peek());
                    }
                }
            }
        }
        return res;
    }
}