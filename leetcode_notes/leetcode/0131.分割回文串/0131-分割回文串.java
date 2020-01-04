class Solution {
    // 131
    // Reference: cspiration
    public List<List<String>> partition(String s) {
        // Time: O(n^2) Space: O(n)
        List<List<String>> res = new ArrayList<>();
        if(s == null || s.length() == 0) return res;
        partition(res, new ArrayList<>(), s);
        return res;
    }
    
    private void partition(List<List<String>> res, List<String> list, String s) {
        if(s.length() == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < s.length(); i++) {
            if(isPalindrome(s.substring(0, i + 1))) {
                list.add(s.substring(0, i + 1));
                partition(res, list, s.substring(i + 1));
                list.remove(list.size() - 1);
            }
        }
    }
    
    private boolean isPalindrome(String s) {
        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}