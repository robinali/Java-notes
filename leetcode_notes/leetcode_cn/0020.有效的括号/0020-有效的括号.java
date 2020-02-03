class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> hm = new HashMap<Character, Character>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
    
        for(Character ch : s.toCharArray()) {
            if(hm.get(ch) == null)
                stack.push(ch);
            else if(stack.isEmpty() || hm.get(ch) != stack.pop())
                return false;
        }
        return stack.isEmpty();
    }
}