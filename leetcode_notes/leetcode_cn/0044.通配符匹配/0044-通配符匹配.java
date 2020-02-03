class Solution {
    public boolean isMatch(String s, String p) {
        // Time O(n) Space O(1)
        int sp = 0, pp = 0, match = 0, star = -1;
        while(sp < s.length()) {
            if(pp < p.length() && (s.charAt(sp) == p.charAt(pp) || p.charAt(pp) == '?')) {
                sp++;
                pp++;
            } else if (pp < p.length() && p.charAt(pp) == '*') {
                star = pp;
                match = sp;
                pp++;
            } else if(star != -1) {
                pp = star + 1;
                match++;
                sp = match;
            } else {
                return false;
            }
        }
        while (pp < p.length() && p.charAt(pp) == '*') {
            pp++;
        }
        return pp == p.length();
    }
}