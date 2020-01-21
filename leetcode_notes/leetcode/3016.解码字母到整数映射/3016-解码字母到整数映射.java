class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int idx = 0; idx < s.length(); idx++){
            if((idx + 2) < s.length() && s.charAt(idx + 2) == '#') {
                sb.append((char)(Integer.parseInt(s.substring(idx++, ++idx)) + 'a' - 1));
            } else {
                sb.append((char)(s.charAt(idx) - '0' + 'a' - 1));
            }
        }
        return sb.toString();
    }
}