class MedianFinder {
    private PriorityQueue<Long> small;
    private PriorityQueue<Long> large;

    /** initialize your data structure here. */
    public MedianFinder() {
        small = new PriorityQueue<>(Collections.reverseOrder());
        //small = new PriorityQueue<>((x, y) -> y - x);
        large = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        large.add((long)num);
        small.add(large.poll());
        if(large.size() < small.size()) {
            large.add(small.poll());
        }
    }
    
    public double findMedian() {
        return large.size() > small.size() ? large.peek() : (large.peek() + small.peek()) / 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */