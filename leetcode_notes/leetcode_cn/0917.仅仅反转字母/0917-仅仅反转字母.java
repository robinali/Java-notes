class Solution {
    public String reverseOnlyLetters(String S) {
        
        char[] c = S.toCharArray();
        for (int i = 0, j = c.length - 1; i <= j; i++) {
            int ai = c[i];
            if ((65 <= ai && ai <= 90) || (97 <= ai && ai <= 122)) {
                for(;j > i; j--) {
                int aj = c[j];
                 if((65 <= aj && aj <= 90) || (97 <= aj && aj <= 122))
                     break;
                }
                char tmp = c[i];
                c[i] = c[j];
                c[j] = tmp;
                j--;
            }
        }
        String rtn = new String(c);
        return rtn;
    }
}