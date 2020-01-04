class Solution {
    // 76
    // Reference: cspiration
    public String minWindow(String s, String t) {
        // Time: O(n) Space: O(1)
        /*
               A B C D E F G H     O
        count: 0 0 0 -1 -1         -1
               0 1 2 3 4 5 6 7 ...
        */
        int[] cnt = new int[128];
        for(char c: t.toCharArray()) {
            cnt[c]++;
        }
        int from = 0;
        int total = t.length();
        int min = Integer.MAX_VALUE;
        for(int i = 0, j = 0; i < s.length(); i++) {
            if(cnt[s.charAt(i)]-- > 0) total--;
            while(total == 0) {
                if(i - j + 1 < min) {
                    min = i - j + 1;
                    from = j;
                }
                if(++cnt[s.charAt(j++)] > 0) total++;
            }
        }
        return (min == Integer.MAX_VALUE) ? "": s.substring(from, from + min);
    }
}