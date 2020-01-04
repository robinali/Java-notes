class Solution {
    // 90
    // Reference: cspiration
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // Time: O(2^n) Space: O(n)
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums, int index) {
        res.add(new ArrayList<>(list));
        for(int i = index; i < nums.length; i++) {
            if(i != index && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            backtrack(res, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}