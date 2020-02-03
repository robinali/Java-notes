class FooBar {
    private int n;
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    private int state = 0;

    public FooBar(int n) {
        this.n = n;
        synchronized(lock2) {
            state = 0;
            lock2.notify();
        }
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            synchronized(lock2) {
                if(state != 0) {
                    lock2.wait();
                }
            }
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            synchronized(lock1) {
                state = 1;
                lock1.notify();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            synchronized(lock1) {
                if(state != 1) {
                    lock1.wait();
                }
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            synchronized(lock2) {
                state = 0;
                lock2.notify();
            }
        }
    }
}