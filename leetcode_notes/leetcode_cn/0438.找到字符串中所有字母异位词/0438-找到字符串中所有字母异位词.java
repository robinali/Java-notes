class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s == null || p == null || s.length() < p.length()) return res;
        int[] chars = new int[26];
        for(char c : p.toCharArray()) {
            chars[c - 'a']++;
        }
        int start = 0, end = 0;
        int count = p.length();
        while(end < s.length()) {
            if(chars[s.charAt(end++) - 'a']-- >= 1) {
                count--;
            }
            if(count == 0) res.add(start);
            if(end - start == p.length() && chars[s.charAt(start++) - 'a']++ >= 0) {
                count++;
            }
        }
        return res;
    }
}