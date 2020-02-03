class Solution {
    // 120
    // Rference: cspiration
    public int minimumTotal(List<List<Integer>> triangle) {
        // Time: O(n^2) Space: O(n)
        int[] res = new int[triangle.size() + 1];
        for(int i = triangle.size() - 1; i >= 0; i--) {
            for(int j = 0; j < triangle.get(i).size(); j++) {
                res[j] = Math.min(res[j], res[j + 1]) + triangle.get(i).get(j);
            }
        }
        return res[0];
    }
}