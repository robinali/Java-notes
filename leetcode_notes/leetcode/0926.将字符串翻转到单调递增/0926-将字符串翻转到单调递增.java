class Solution {
    public int minFlipsMonoIncr(String S) {
        int l = S.length();
        if (S == null || l == 0) {
            return 0;
        }
        char[] n = S.toCharArray();

        int cntz = 0;
        int cnto = 0;
        int cntm = 0;
        // Count max in difference, count of 0, count of 1
        for (int i = 0; i< l; i++) {
            if (n[i] == '1') {
                cnto++;
            }
            if (cnto > 0 && n[i] == '0') {
                cntz++;
            }

            if (cntz > cnto) {
                cntm += cnto;
                cntz = 0;
                cnto = 0;
            }
        }
        if (cntz > 0) {
            cntm += cntz;
        }
        return cntm;
    }
}