class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int nl = name.length();
        int tl = typed.length();
        if (name == null || typed == null ||
            nl == 0 || tl == 0 ||
            nl > tl ) {
            return false;
        }

        char[] n = name.toCharArray();
        char[] t = typed.toCharArray();

        int i = 0, j = 0;
        for (; i< nl && j < tl; j++) {
            if (n[i] == t[j]) {
                i++;
                continue;
            }
            else if (j > 0 && t[j] == t[j - 1]) {
                continue;
            }
        }
        while (j < tl) {
            if (t[j] == t[j - 1]) {
                j++;
                continue;
            }
            return false;
        }
        if ((i == nl) && (j == tl)) {
            return true;
        }
        return false;
    }
}