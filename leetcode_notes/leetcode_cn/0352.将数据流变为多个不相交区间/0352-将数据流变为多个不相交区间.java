class SummaryRanges {
    
    private TreeMap<Integer, int[]> tm;

    /** Initialize your data structure here. */
    public SummaryRanges() {
        tm = new TreeMap<>();
    }
    
    public void addNum(int val) {
        if(tm.containsKey(val)) return;
        Integer lk = tm.lowerKey(val);
        Integer hk = tm.higherKey(val);
        if(lk != null && hk != null && tm.get(lk)[1] + 1 == val && tm.get(hk)[0] - 1 == val) {
            tm.get(lk)[1] = tm.get(hk)[1];
            tm.remove(hk);
        } else if(lk != null && tm.get(lk)[1] + 1 >= val) {
            tm.get(lk)[1] = Math.max(tm.get(lk)[1], val);
        } else if(hk != null && tm.get(hk)[0] - 1 == val) {
            tm.put(val, new int[]{val, tm.get(hk)[1]});
            tm.remove(hk);
        } else {
            tm.put(val, new int[]{val, val});
        }
    }
    
    public int[][] getIntervals() {
        return tm.values().toArray(new int[tm.size()][2]);
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(val);
 * int[][] param_2 = obj.getIntervals();
 */
