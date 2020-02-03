class Solution {
    // 159
    // Reference: cspiration
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        // Time: O(n) Sapce: O(n)
        if(s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0;
        int res = 0;
        while(end < s.length()) {
            if(map.size() <= 2) {
                map.put(s.charAt(end), end);
                end++;
            }
            if(map.size() > 2) {
                int leftMost = s.length();
                for(int num : map.values()) {
                    leftMost = Math.min(leftMost, num);
                }
                map.remove(s.charAt(leftMost));
                start = leftMost + 1;
            }
            res = Math.max(res, end - start);
        }
        return res;
    }
}