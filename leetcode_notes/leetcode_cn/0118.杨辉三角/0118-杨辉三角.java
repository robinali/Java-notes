class Solution {
    // 118
    // Reference: cspiration
    public List<List<Integer>> generate(int numRows) {
        // Time: (n^2) Space: O(n)
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            list.add(0, 1);
            for(int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}