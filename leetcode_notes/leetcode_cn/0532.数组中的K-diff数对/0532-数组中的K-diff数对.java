class Solution {
    // 532
    // Reference: Luckman form leetcode
    public int findPairs(int[] nums, int k) {
        // Time: O(n) Space: O(m * n)
        if(k < 0) return 0;
        Map<Integer, Boolean> map = new HashMap<>();
        int ret = 0;
        for(int n : nums) {
            if(map.containsKey(n - k) && !map.get(n - k)) {
                map.put(n - k, true);
                ret++;
            }
            if(map.containsKey(n + k) && (!map.containsKey(n) || !map.get(n))) {
                map.put(n, true);
                ret++;
            }
            if(!map.containsKey(n)) {
                map.put(n, false);
            }
        }
        return ret;
    }
}