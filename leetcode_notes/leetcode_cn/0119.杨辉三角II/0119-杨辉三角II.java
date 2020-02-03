class Solution {
    // 119
    // Reference: cspiration
    public List<Integer> getRow(int rowIndex) {
        // Time: O(n^2) Space: O(n)
        List<Integer> res = new ArrayList<>();
        if(rowIndex < 0) return res;
        for(int i = 0; i <= rowIndex; i++) {
            res.add(0, 1);
            for(int j = 1; j < res.size() - 1; j++) {
                res.set(j, res.get(j) + res.get(j + 1));
            }
        }
        return res;
    }
}