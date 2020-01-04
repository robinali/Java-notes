class Solution {
    // 216
    // Reference: cspiration
    public List<List<Integer>> combinationSum3(int k, int n) {
        // Time: O(2^n) Sapce: O(n)
        List<List<Integer>> res = new ArrayList<>();
        combinationSum3(res, new ArrayList<>(), k, n, 1);
        return res;
    }
    
    private void combinationSum3(List<List<Integer>> res, List<Integer> list, int k, int n, int start) {
        if(k == 0 && n == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i <= 9; i++) {
            list.add(i);
            combinationSum3(res, list, k - 1, n - i, i + 1);
            list.remove(list.size() - 1);
        }
    }
}