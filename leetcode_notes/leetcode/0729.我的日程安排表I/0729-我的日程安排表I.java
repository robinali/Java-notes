class MyCalendar {
    private TreeSet<int[]> books;

    public MyCalendar() {
        books = new TreeSet<int[]>((int[] a, int[] b) -> a[0] - b[0]);
    }
    
    public boolean book(int start, int end) {
        int[] book = new int[] {start, end},  floor = books.floor(book), ceiling = books.ceiling(book);
        if(floor != null && start < floor[1]) return false;
        if(ceiling != null && ceiling[0] < end) return false;
        books.add(book);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */