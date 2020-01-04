class Solution {
    public int lengthOfLastWord(String s) {
        // Time: O(1) Sapce: O(1)
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}