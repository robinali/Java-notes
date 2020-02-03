class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        
        if(str == null || str.length() == 0) return 0;
        
        int sign = 1;
        int start = 0;
        long res = 0;
        if (str.charAt(0) == '+') {
            start++;
        } else if(str.charAt(0) == '-') {
            sign = -1;
            start++;
        }
        
        for(int i = start; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                return (int) res * sign;
            }
            res = res * 10 + str.charAt(i) - '0';
            if(sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return sign * (int) res;
    }
}