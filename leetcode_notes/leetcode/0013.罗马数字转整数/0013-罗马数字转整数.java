class Solution {
    public int romanToInt(String s) {
        // Time: O(n) Space: O(1)
        if (s == null || s.length() == 0) return 0;
        
        int res = toNumber(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            if(toNumber(s.charAt(i)) > toNumber(s.charAt(i - 1))) {
                res += toNumber(s.charAt(i)) - toNumber(s.charAt(i - 1)) * 2;
            } else {
                res += toNumber(s.charAt(i));
            }
        }
        return res;
    }
    
    private int toNumber(char c) {
        int res = 0;
        switch(c) {
            case 'I' : res = 1; break;
            case 'V' : res = 5; break;
            case 'X' : res = 10; break;
            case 'L' : res = 50; break;
            case 'C' : res = 100; break;
            case 'D' : res = 500; break;
            case 'M' : res = 1000; break;
        }
        return res;
    }
}