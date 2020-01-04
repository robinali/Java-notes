class Solution {
    // 89
    // Reference: cspiration
    // G(i) = i ^ (i/2)
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < 1 << n; i++) {
            res.add(i ^ i >> 1);
        }
        return res;
    }
}