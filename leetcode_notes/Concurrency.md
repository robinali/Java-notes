java.util.concurrent package.
# Processes and Threads
A coomputer system usually has many active process and threads. One process has one or more threads.
Computer system on single execution core -> one thread at a time -> time slicing.
Multiple thread in sam time -> multiple processor / processors with multiple execution core.

## Process
    * A process has self-contained execution enviroment. Each process has its own memory space.
    * Most implementations of JVM runn as single porcess. Multiprocess Java application can create addition processes using a __ProcessBuilder__

## Threads
    * Sometimes called _lightweight processes_**.
    * Threads within a process __share the process's resources, including memory and open files**.

# Thread User cases
## Provide a runnable object
## Use a subclass thread
## Synchronized Statements
## Using the lock associated with _this_**
## Atomic Access: atomic variables, keyword _volatile_**
    * java.util.concurrent.atomic.AtomicInteger;
## Guarded Blockes: wait(), notifyAll()
## Reentrant Synchronization: allowing a thread to acquire the same lock more than once.
### Lock Objects
    * java.util.concurrent.locks.Lock;
    * java.util.concurrent.locks.ReentrantLock;
### Executors:
    * (new Thread(r)).start();
    * e.execute(r);

# Leetcode Q&A
## 	[1114 Print in Order]](https://leetcode.com/problems/print-in-order/)
### Guarded Blockes: wait(), notifyAll()
```java
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
```

## 	[1115 Print FooBar Alternately]](https://leetcode.com/problems/print-foobar-alternately/)
### Guarded Blockes: wait(), notifyAll()
```java
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
```

## 	[1116 Print Zero Even Odd]](https://leetcode.com/problems/print-zero-even-odd/)
### Guarded Blockes: wait(), notifyAll()
```java
class ZeroEvenOdd {
    private int n;
    private boolean iszero=true;
    private boolean isodd=true;
    private boolean iseven=false;

    private Object lock = new Object();
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
           synchronized (lock) {
            while(!iszero){
                lock.wait();
            }
            printNumber.accept(0);
            iszero=false;
            lock.notifyAll();
        }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
        synchronized (lock) {
            while(iszero || !iseven){
                lock.wait();
            }
            printNumber.accept(i);
            iseven=false;
            isodd=true;
            iszero=true;
            lock.notifyAll();
        }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
        synchronized (lock) {
            while(iszero || !isodd){
                lock.wait();
            }
            printNumber.accept(i);
            iseven=true;
            isodd=false;
            iszero=true;
            lock.notifyAll();
        }
        }
    }
}
```

### Guarded Blockes: wait(), notify()
```java
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
```

### Using the lock associated with _this_**
```java
class ZeroEvenOdd {
    private int n;
	private int value = 0;

	private boolean lastOdd = false;
	private boolean lastEven = true;
	private boolean lastZero = false;


	public ZeroEvenOdd(int n) {
		this.n = n;
	}

	// printNumber.accept(x) outputs "x", where x is an integer.
	public void zero(IntConsumer printNumber) throws InterruptedException {

		synchronized(this) {
			while(true) {
				if (value == n) return;
				if ((lastOdd || lastEven) && !lastZero) {
					printNumber.accept(0);
					lastZero = true;
					notifyAll();
				} else {
					wait();
				}
			}
		}
	}

	public void even(IntConsumer printNumber) throws InterruptedException {
		 synchronized(this) {
			 while(true) {
				if (value == n) return;
				if (lastOdd && lastZero && !lastEven) {
					printNumber.accept(++value);
					lastZero = false;
					lastEven = true;
					lastOdd = false;
					notifyAll();
				} else {
					wait();
				}
			 }
		}
	}

    public void odd(IntConsumer printNumber) throws InterruptedException {
        synchronized(this) {
            while(true) {
                if (value == n) return;
                if (lastEven && lastZero && !lastOdd) {
                    printNumber.accept(++value);
                    lastZero = false;
                    lastEven = false;
                    lastOdd = true;
                    notifyAll();
                } else {
                    wait();
                }
            }
        }
    }
}
```
## Reentrant Synchronization: allowing a thread to acquire the same lock more than once.
### Lock Objects
    * java.util.concurrent.locks.ReentrantLock;
    * java.util.concurrent.locks.Condition;
```java
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

class ZeroEvenOdd {
    private int n;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition printZero = lock.newCondition();
    private final Condition printOdd = lock.newCondition();
    private final Condition printEven = lock.newCondition();
    
    private int state = 0;
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            lock.lock();
            if(state != 0) {
                printZero.await();
            }
            printNumber.accept(0);
            if((i & 1) == 0) {
                state = 2;
                printEven.signalAll();
            } else {
                state = 1;
                printOdd.signalAll();
            }
            lock.unlock();
        }
        
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for(int i = 2; i <= n; i += 2) {
            lock.lock();
            while(state != 2) {
                printEven.await();
            }
            printNumber.accept(i);
            state = 0;
            printZero.signalAll();
            lock.unlock();
        }
        
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i = 1; i <= n; i += 2) {
            lock.lock();
            while(state != 1) {
                printOdd.await();
            }
            printNumber.accept(i);
            state = 0;
            printZero.signalAll();
            lock.unlock();
        }
    }
}
```

# References:
    * The java Tutorial Ashort Cource on the Basices
    * Huahua's blog https://zxi.mytechroad.com/blog/
    * Leetcode Disscossion (__Links to be added__) 
