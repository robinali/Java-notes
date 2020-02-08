class Solution {
    // Reference: https://leetcode.com/problems/shuffle-an-array/solution/
    private int[] nums;
    private int[] org;
    
    private Random rand = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
        this.org = nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        this.nums = this.org;
        this.org = this.org.clone();
        return this.nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> aux = new ArrayList<Integer>();
        for(int num : this.nums) {
            aux.add(num);
        }
        
        for (int i = 0; i < this.nums.length; i++) {
            int removeIdx = rand.nextInt(aux.size());
            this.nums[i] = aux.get(removeIdx);
            aux.remove(removeIdx);
        }
        return this.nums;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */