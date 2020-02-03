class Solution {
    public int strobogrammaticInRange(String low, String high) {
        int res = 0;
        List<String> list = new ArrayList<>();
        for(int i = low.length(); i <= high.length(); i++) {
            list.addAll(strobogrammaticInRange(i, i));
        }
        for(String num : list) {
            if((num.length() == low.length() && num.compareTo(low) < 0) || (num.length() == high.length() && num.compareTo(high) > 0)) {
                continue;
            }
            res++;
        }
        return res;
    }
    
    private List<String> strobogrammaticInRange(int cur, int max) {
        if(cur == 0) return new ArrayList<>(Arrays.asList(""));
        if(cur == 1) return new ArrayList<>(Arrays.asList("0", "1", "8"));
        
        List<String> res = new ArrayList<>();
        List<String> center = strobogrammaticInRange(cur - 2, max);
        
        for(int i = 0; i < center.size(); i++) {
            String temp = center.get(i);
            if(cur != max) res.add("0" + temp + "0");
            res.add("1" + temp + "1");
            res.add("6" + temp + "9");
            res.add("8" + temp + "8");
            res.add("9" + temp + "6");
        }
        return res;
    }
}