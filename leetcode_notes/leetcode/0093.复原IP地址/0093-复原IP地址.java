class Solution {
    // 93
    // Reference: cspiration
    public List<String> restoreIpAddresses(String s) {
        // Time: O(3 ^ 4) Space: O(n)
        // Backtracking
        List<String> res = new ArrayList<>();
        backtrack(res, s, 0, "", 0);
        return res;
    }
    
    private void backtrack(List<String> res, String s, int index, String ret, int count) {
        if(count > 4) return;
        if(count == 4 && index == s.length()) {
            res.add(ret);
            return;
        }
        for(int i = 1; i < 4; i++) {
            if(index + i > s.length()) break;
            String temp = s.substring(index, index + i);
            if((temp.startsWith("0") && temp.length() > 1) || (i == 3 && Integer.parseInt(temp) >= 256)) continue;
            backtrack(res, s, index + i, ret + temp + (count == 3 ? "": "."), count + 1);
        }
    }
}