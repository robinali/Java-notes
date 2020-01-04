class Solution {
    public int[][] merge(int[][] intervals) {
        // Scan line
        // Time O(nlogn) Space: O(n)
        if (intervals == null || intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        int[][] list = new int[intervals.length][2];
        int idx = 0;
        for(int[] interval : intervals) {
            if(interval[0] <= end) {
                end = Math.max(end, interval[1]);
            } else {
                list[idx][0] = start;
                list[idx++][1] = end;
                start = interval[0];
                end = interval[1];
            }
        }
        list[idx][0] = start;
        list[idx++][1] = end;
        
        int[][] res = new int[idx][2];
        for(int i = 0; i < idx; i++) {
                res[i][0] = list[i][0];
                res[i][1] = list[i][1];
        }
        return res;
    }
}