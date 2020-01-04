class Solution {
    // 77
    // Reference: cspiration
    public List<List<Integer>> combine(int n, int k) {
        // Time: O(nˆmin{k, n - k}) Space: O(n)
        List<List<Integer>> res = new ArrayList<>();
        getCombine(res, new ArrayList<>(), n, k, 1);
        return res;
    }
    
    private void getCombine(List<List<Integer>> res, List<Integer> list, int n, int k, int start) {
        if(k == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for( int i = start; i <= n; i++) {
            list.add(i);
            getCombine(res, list, n, k - 1, i + 1);
            list.remove(list.size() - 1);
        }
    }
}