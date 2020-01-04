class Solution {
    public int calculate(String s) {
        // Time: O(n) Space: O(1)
        if(s == null || s.length() == 0) return 0;
        s = s.trim().replaceAll(" +", "");
        int res = 0, preVal = 0, i = 0;
        char sign = '+';
        while(i < s.length()) {
            int curVal = 0;
            while(i < s.length() && Character.isDigit(s.charAt(i))) {
                curVal = curVal * 10 + s.charAt(i) - '0';
                i++;
            }
            if(sign == '+') {
                res += preVal;
                preVal = curVal;
            } else if(sign == '-') {
                res += preVal;
                preVal = -curVal;
            } else if(sign == '*') {
                preVal = preVal * curVal;
            } else if(sign == '/') {
                preVal = preVal / curVal;
            }
            if(i < s.length()) {
                sign = s.charAt(i);
                i++;
            }
        }
        res += preVal;
        return res;
    }
}