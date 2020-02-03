class Solution {
    public int shortestSubarray(int[] A, int K) {
        int minLen = A.length + 1;
        int[] preSum = new int[A.length + 1];
        preSum[0] = 0;
        for (int i = 0; i < A.length; i++) {
            preSum[i + 1] = preSum[i] + A[i];
        }
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < A.length + 1; i++) {
            while (!deque.isEmpty() && preSum[i] <= preSum[deque.getLast()]) {
                // 1.
                deque.pollLast();
            }

            while (!deque.isEmpty() && preSum[i] - preSum[deque.getFirst()] >= K) {
                // 2.
                int new_len = i - deque.pollFirst();
                if (new_len < minLen) {
                    minLen = new_len;
                }
            }

            deque.addLast(i);
        }
        return minLen == A.length + 1 ? -1 : minLen;
    }
}