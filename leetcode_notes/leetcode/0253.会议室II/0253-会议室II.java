class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> heap = new PriorityQueue<>(intervals.length, (a, b) -> a[1] - b[1]);
        heap.offer(intervals[0]);
        for(int i = 1; i < intervals.length; i++) {
            int[] interval = heap.poll();
            if(intervals[i][0] >= interval[1]) {
                interval[1] = intervals[i][1];
            } else {
                heap.offer(intervals[i]);
            }
            heap.offer(interval);
        }
        return heap.size();
    }
}