class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0) return s;
        String[] str = s.split(" ");
        for(int i = 0; i < str.length; i++) {
            str[i] = new StringBuilder(str[i]).reverse().toString();
        }
        StringBuilder sb = new StringBuilder();
        for(String st : str) {
            sb.append(st + " ");
        }
        return sb.toString().trim();
    }
}