class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // time: O(n!) space O(n)
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        exchangeStart(res, 0, nums);
        return res;
    }
    
    private void exchangeStart(List<List<Integer>> res, int start, int[] nums) {
        if(start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < nums.length ; i++) {
            swap(nums, start, i);
            exchangeStart(res, start + 1, nums);
            swap(nums, start, i);
        }
    }
    
    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}