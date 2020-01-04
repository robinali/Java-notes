class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // Time : O(n) Space : O(n)
        if(newInterval == null) return intervals;
        int[][] list = new int[intervals.length + 1][2];
        int i = 0;
        int idx = 0;
        while(i < intervals.length && intervals[i][1] < newInterval[0]) {
            list[idx][0] = intervals[i][0];
            list[idx++][1] = intervals[i++][1];
        }
        while(i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i++][1]);
        }
        list[idx][0] = newInterval[0];
        list[idx++][1] = newInterval[1];
        while(i < intervals.length) {
            list[idx][0] = intervals[i][0];
            list[idx++][1] = intervals[i++][1];
        }
        int[][] res = new int[idx][2];
        for(int j = 0; j < idx; j++) {
            res[j][0] = list[j][0];
            res[j][1] = list[j][1];
        }
        return res;
    }
}