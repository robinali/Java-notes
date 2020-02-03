class Solution {
    public void reverseString(char[] s) {
        reverseString(s, 0, s.length - 1);
    }
    
    private void reverseString(char[] s, int l, int r) {
        if(l >= r) return;
        char tmp = s[l];
        s[l] = s[r];
        s[r] = tmp;
        reverseString(s, ++l, --r);
    }
}