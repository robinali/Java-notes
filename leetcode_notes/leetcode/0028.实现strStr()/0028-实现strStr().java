class Solution {
    public int strStr(String haystack, String needle) {
        // Substring
        // Timr O(Nˆ2) Space O(1)
        if(needle.length() == 0) return 0;
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.substring(i, i + needle.length()).equals(needle)) return i;
        }
        return -1;
    }
}