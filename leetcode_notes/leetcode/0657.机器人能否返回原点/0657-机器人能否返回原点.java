class Solution1 {
    public boolean judgeCircle(String moves) {
        if(moves == null || moves.length() == 0) return true;

        int row = 0, col = 0;
        for(char c : moves.toCharArray()) {
            if(c == 'U') row++;
            else if(c == 'D') row--;
            else if(c == 'L') col--;
            else if (c == 'R') col++;
        }
        return (row == 0 && col == 0);
    }
}

class Solution {
    public boolean judgeCircle(String moves) {
        if(moves == null || moves.length() == 0) return true;
        int[] cnt = new int[26];
        for(char c : moves.toCharArray()) cnt[c - 'A']++;
        return (cnt['L'- 'A'] == cnt ['R' - 'A'] && cnt['U' - 'A'] == cnt['D' - 'A']);
    }
}