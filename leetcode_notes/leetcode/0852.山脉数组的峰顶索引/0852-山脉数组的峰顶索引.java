class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int l = 0, h = A.length - 1;
        while (l < h) {
            int mid = (h - l) / 2 + l;
            if(A[mid] > A[mid - 1] && A[mid] > A[mid + 1])
                return mid;
            else if(A[mid] > A[mid + 1] && A[mid] <A[mid - 1])
                h = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}