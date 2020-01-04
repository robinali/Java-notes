class Solution {
    // 125
    // Reference: cspiration
    public boolean isPalindrome(String s) {
        // Time: O(n) Space: O(1)
        if(s == null || s.length() == 0) return true;
        int left = 0, right = s.length() - 1;
        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}