class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for(char j : J.toCharArray()) {
            set.add(j);
        }
        
        int res = 0;
        for(char s : S.toCharArray()) {
            if(set.contains(s))
                res++;
        }
        return res;
    }
}