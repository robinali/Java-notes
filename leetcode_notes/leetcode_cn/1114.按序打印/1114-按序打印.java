class Foo {
    private int state = 0;
    Object lock1 = new Object();
    Object lock2 = new Object();
    
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        synchronized(lock1) {
            state = 1;
            lock1.notify();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        synchronized(lock1) {
            if(state != 1) {
                lock1.wait();
            }
        }
        printSecond.run();
        synchronized(lock2){
            state = 2;
            lock2.notify();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        synchronized(lock2) {
            if(state != 2) {
                lock2.wait();
            }
        }
        printThird.run();
    }
}