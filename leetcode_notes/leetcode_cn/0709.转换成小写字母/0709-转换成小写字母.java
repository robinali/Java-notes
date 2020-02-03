class Solution {
    public String toLowerCase(String str) {
        if(str == null || str.length() == 0) return str;
        char[] res = str.toCharArray();
        for(int i = 0; i < res.length; i++) {
            res[i] = (char)(res[i] | (char)32);
        }
        return String.valueOf(res);
    }
}