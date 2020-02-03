class MyCalendarTwo {
    private List<int[]> list;

    public MyCalendarTwo() {
        list = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        MyCalendar calendar = new MyCalendar();
        for(int[] i : list) {
            if(i[0] < start && i[1] > start) {
                if(!calendar.book(start, i[1])) {
                    return false;
                }
            } else if (i[0] >= start && i[0] < end) {
                if(!calendar.book(i[0], Math.min(i[1], end))) {
                    return false;
                }
            }
        }
        list.add(new int[] {start, end});
        return true;
    }
    private class MyCalendar {
        TreeMap<Integer, Integer> tm;
        
        public MyCalendar(){
            tm = new TreeMap<>();
        }
        
        public boolean book (int start, int end) {
            Integer i = tm.lowerKey(end);
            if(i != null && i >= start) {
                return false;
            }
            i = tm.lowerKey(start);
            if(i != null && tm.get(i) > start) {
                return false;
            }
            tm.put(start, end);
            return true;
        }
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */