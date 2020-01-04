class Solution {
    // 78
    // Reference: cspiration
    public List<List<Integer>> subsets(int[] nums) {
        // Time: O(2ˆn) Space: O(n)
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        getSubsets(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void getSubsets(List<List<Integer>> res, List<Integer> list, int[] nums, int index) {
        res.add(new ArrayList<>(list));
        for(int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            getSubsets(res, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}