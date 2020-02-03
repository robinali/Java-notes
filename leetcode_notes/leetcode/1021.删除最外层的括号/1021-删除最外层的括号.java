class Solution {
    public String removeOuterParentheses(String S) {
        int left = 0;
        StringBuilder rtn = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c == '(' && left ++ > 0)
                rtn.append(c);
            if(c == ')' && --left > 0)
            rtn.append(c);
        }
        return rtn.toString();
    }
}