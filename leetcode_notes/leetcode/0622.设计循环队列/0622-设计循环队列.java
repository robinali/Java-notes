class MyCircularQueue {
    
    private int[] queue;
    private int p_head;
    private int p_tail;
    private int count;
    private int capacity;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.p_head = 0;
        this.p_tail = 0;
        this.count = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(this.count == this.capacity) return false;
        this.queue[p_tail] = value; // p_tail = (p_head + count) % capacity
        this.p_tail = (this.p_tail + 1) % this.capacity;
        //this.queue[(this.p_head + this.count) % this.capacity] = value;
        this.count++;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(count == 0) return false; // count = (p_tail > p_head ? p_tail - p_head + 1 : p_tail + capacity - p_head)
        this.p_head = (this.p_head + 1) % this.capacity;
        this.count--;
        return true;
        
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(count == 0)  return -1; // count = (p_tail + capadity - p_head) % capacity
        return this.queue[this.p_head];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(count == 0) return -1;
        return this.queue[(this.p_tail + this.capacity - 1 ) % this.capacity];
        //int tailIndex = (this.p_head + this.count - 1) % this.capacity;
        //return this.queue[tailIndex];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return (this.count == 0);
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (this.count == this.capacity);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */