class Solution {
    // 187
    // Reference: cspiration
    public List<String> findRepeatedDnaSequences(String s) {
        // Time: O(n) Space: O(n)
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        for(int i = 0; i < s.length() - 9; i++) {
            String temp = s.substring(i, i + 10);
            if(!seen.add(temp)) {
                repeated.add(temp);
            }
        }
        return new ArrayList<>(repeated);
    }
}