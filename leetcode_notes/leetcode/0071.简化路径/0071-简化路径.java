class Solution {
    // 71
    // Reference: cspiration
    public String simplifyPath(String path) {
        // Time: O(n) Space: O(m)
        Deque<String> stack = new ArrayDeque<>();
        String[] paths = path.split("/+");
        for(String s : paths) {
            if(s.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else if(!s.equals(".") && !s.equals("")) {
                stack.push(s);
            }
        }
        String res = "";
        while(!stack.isEmpty()) {
            res = "/" + stack.pop() + res;
        }
        if(res.length() == 0) {
            return "/";
        }
        return res;
    }
}