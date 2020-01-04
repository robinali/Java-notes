class Solution {
    // 150
    // Reference: scpiration
    public int evalRPN(String[] tokens) {
        // Time: O(n) Space: O(n)
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s: tokens) {
            if(s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                int second = stack.pop();
                stack.push(stack.pop() - second);
            } else if(s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                int second = stack.pop();
                stack.push(stack.pop() / second);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}