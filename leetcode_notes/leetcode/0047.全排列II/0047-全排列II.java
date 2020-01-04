class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        // Time O(n!) Space O(1)
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        swapStart(res, nums, 0);
        return res;
    }
    
    private void swapStart(List<List<Integer>> res, int[] nums, int start) {
        if(start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int num: nums) {
                list.add(num);
            }
            res.add(list);
            return;
        }
        for(int i = start; i < nums.length; i++) {
            if(isUsed(nums, start, i)) continue;
            swap(nums, start, i);
            swapStart(res, nums, start + 1);
            swap(nums, start, i);
        }
    }
    
    private void swap(int[] nums, int l, int r) {
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
    }
    
    private boolean isUsed(int[] nums, int i, int j) {
        for(int x = i; x < j; x++ ) {
            if(nums[x] == nums[j]) return true;
        }
        return false;
    }
}