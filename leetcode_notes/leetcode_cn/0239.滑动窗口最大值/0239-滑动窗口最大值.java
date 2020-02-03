class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) return new int[0];
        
        LinkedList<Integer> list = new LinkedList<>();
        int[] res = new int[nums.length + 1 - k];
        for(int i = 0; i < nums.length; i++) {
            if(!list.isEmpty() && list.peekFirst() == i - k) {
                list.pop();
            }
            
            while(!list.isEmpty() && nums[list.peekLast()] < nums[i]) {
                list.removeLast();
            }
            list.offerLast(i);
            if((i + 1) >= k) {
                res[i + 1 - k] = nums[list.peekFirst()];
            }
        }
        return res;
    }
}