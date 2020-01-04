class Solution {
    public int calculateTime(String keyboard, String word) {
        if(word == null || word.length() == 0) return 0;
        
        HashMap<Character, Integer> kMap = new HashMap<>();
        int idx = 0;
        int res = 0;
        
        for(Character ch : keyboard.toCharArray()) {
            kMap.put(ch, idx++);
        }
        
        idx = 0;
        Character lastCh = null;
        for(Character ch : word.toCharArray()) {
            if(idx++ == 0)
                res += Math.abs(kMap.get(ch) - 0);
            else
                res += Math.abs(kMap.get(ch) - kMap.get(lastCh));
            lastCh = ch;
        }
        return res;
    }
}