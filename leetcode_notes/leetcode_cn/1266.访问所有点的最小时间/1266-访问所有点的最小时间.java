class Solution {
    private int countSteps(int[] a, int[] b) {
        return Math.max(Math.abs(a[0] - b[0]), Math.abs(a[1] - b[1]));
    }
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length <= 1) return 0;
        int rtn = 0;
        for(int i = 1; i < points.length; i++) {
            rtn += countSteps(points[i - 1], points[i]);
        }
        return rtn;
    }
}