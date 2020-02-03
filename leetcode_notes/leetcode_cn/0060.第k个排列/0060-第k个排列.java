class Solution {
    public String getPermutation(int n, int k) {
        // Time: O(n) Space: O(n)
        // n = 4, k = 17
        // fact: 1 1 2 6
        // i = 4 index = 12 / 6 = 2  k = 17 % 6 = 5
        // i = 3 index = 5 / 2 = 2 k = 5 % 2 = 1
        // i = 2 index = 1 / 1 = 1 k = 1 % 1 = 0
        // 3 4 1 2
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            res.add(i);
        }
        int[] fact = new int[n];
        fact[0] = 1;
        for(int i = 1; i < n; i++) {
            fact[i] = i * fact[i - 1];
        }
        k = k - 1;
        StringBuilder sb = new StringBuilder();
        for(int i = n; i > 0; i--) {
            int index = k / fact[i - 1];
            k = k % fact[i - 1];
            sb .append(res.get(index));
            res.remove(index);
        }
        return sb.toString();
    }
}