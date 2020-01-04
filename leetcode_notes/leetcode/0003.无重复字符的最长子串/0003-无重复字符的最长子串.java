class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for(int i = 0, j = 0; i < s.length(); ) {
            if(set.contains(s.charAt(i))) {
                set.remove(s.charAt(j++));
            } else {
                set.add(s.charAt(i));
                res = Math.max(res, i - j + 1);
                i++;
            }
        }
        return res;
    }
}