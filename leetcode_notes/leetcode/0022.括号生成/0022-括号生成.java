class Solution {
    public List<String> generateParenthesis(int n) {
        // Time: O(N!) ~ O(Nˆ2)
        // Space: O(n)
        List<String> res = new ArrayList<>();
        if(n == 0) return res;
        backtrack(res, "", n, n);
        return res;
    }
    private void backtrack(List<String> res, String s, int left, int right) {
        if(left > right) {
            return;
        }
        if(left == 0 && right == 0) {
            res.add(s);
            return;
        }
        if(left > 0) {
            backtrack(res, s + "(", left - 1, right);
        }
        if(right > 0) {
            backtrack(res, s + ")", left, right - 1);
        }
    }
}