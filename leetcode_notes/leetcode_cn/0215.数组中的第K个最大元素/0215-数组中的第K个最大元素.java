class Solution {
    // 215
    // Reference: cspiration
    public int findKthLargest(int[] nums, int k) {
        // Time: O(nlogk) Space: O(n)
        if(nums == null || nums.length == 0) return 0;
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums) {
            minHeap.offer(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
}