class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Time O(2ˆn) Space O(n)
        
        List<List<Integer>> res = new ArrayList<>();
        if(candidates == null || candidates.length == 0) return res;
        Arrays.sort(candidates);
        combinationSumWithRes(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    
    
    private void combinationSumWithRes(List<List<Integer>> res, List<Integer> list, int[] candidates, int target, int start) {
        if(target < 0) return;
        if(target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < candidates.length; i++) {
            if(i != start && candidates[i] == candidates[i - 1]) continue;
            list.add(candidates[i]);
            combinationSumWithRes(res, list, candidates, target - candidates[i], i + 1);
            list.remove(list.size() - 1);
        }
    }
}