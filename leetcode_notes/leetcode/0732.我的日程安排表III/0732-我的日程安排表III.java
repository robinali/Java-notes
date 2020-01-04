class MyCalendarThree {
    private TreeMap<Integer, Integer> times;

    public MyCalendarThree() {
         times = new TreeMap<>();
     }
    
    public int book(int start, int end) {
        times.put(start, times.getOrDefault(start, 0) + 1);
        times.put(end, times.getOrDefault(end, 0) - 1);
        int ongoing = 0, k = 0;
        for(int v : times.values()) {
            k = Math.max(k, ongoing += v);
        }
        return k;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */