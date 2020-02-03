class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int lcount = 0;
        int rcount = 0;
        for(char c : s.toCharArray()){
            if(c == 'L') lcount++;
            if(c == 'R') rcount++;

            if(lcount > 0 && lcount == rcount){
                count++;
                lcount = 0;
                rcount = 0;
            }
        }
        return count;
    }
}