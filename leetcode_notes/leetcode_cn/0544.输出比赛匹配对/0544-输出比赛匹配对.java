class Solution {
    public String findContestMatch(int n) {
        StringBuilder sb = new StringBuilder();
        dfs(sb, 3, n, 1);
        return sb.toString();
    }
    
    private void dfs(StringBuilder sb, int sum, int n, int val) {
        if(sum > n + 1) {
            sb.append(val);
            return;
        }
        sb.append('(');
        dfs(sb, (sum << 1) - 1, n, val);
        sb.append(',');
        dfs(sb, (sum << 1) - 1, n, sum - val);
        sb.append(')');
    }
}