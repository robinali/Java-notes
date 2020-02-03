class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n == 0) return res;
        generateParenthesis(res, "", n, n);
        return res;
    }
    
    private void generateParenthesis(List<String> res, String s, int left, int right) {
        if(left > right) {
            return;
        }
        if(left == 0 && right == 0) {
            res.add(s);
            return;
        }
        if(left > 0) {
            generateParenthesis(res, s + "(", left - 1, right);
        }
        if(right > 0) {
            generateParenthesis(res, s + ")", left, right - 1);
        }
    }
}