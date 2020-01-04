class Solution {
    // 218
    // Reference: cspiration
    public List<List<Integer>> getSkyline(int[][] buildings) {
        // Time: O(nlogn) Space: O(n)
        List<List<Integer>> res = new ArrayList<>();
        List<int[]> heights = new ArrayList<>();
        for(int[] b : buildings) {
            heights.add(new int[]{b[0], -b[2]});
            heights.add(new int[]{b[1], b[2]});
        }
        Collections.sort(heights, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        map.put(0, 1);
        int prev = 0;
        
        for(int[] h : heights) {
            if(h[1] < 0) {
                map.put(-h[1], map.getOrDefault(-h[1], 0) + 1);
            }  else {
                int cnt = map.get(h[1]);
                if(cnt == 1) {
                    map.remove(h[1]);
                } else {
                    map.put(h[1], cnt - 1);
                }
            }
            int cur = map.firstKey();
            if(prev != cur) {
                List<Integer> list = new ArrayList<>();
                list.add(h[0]);
                list.add(cur);
                res.add(list);
                prev = cur;
            }
        }
        return res;
    }
}