class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Time O(nlogn) Space O(1)
        int res = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while(i < g.length && j < s.length) {
            if(g[i] <= s[j]) {
                res++;
                i++;
                j++;
            } else if (g[i] > s[j]) {
                j++;
            }
        }
        return res;
    }
}