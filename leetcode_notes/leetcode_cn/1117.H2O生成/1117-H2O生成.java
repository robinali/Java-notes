import java.util.concurrent.Phaser;
import java.util.concurrent.Semaphore;

// Reference: https://leetcode.com/problems/building-h2o/discuss/335566/JAVA-2-semaphores-and-Phaser-faster-than-98.75
class H2O {
    private Semaphore semO;
    private Semaphore semH;
    private Phaser phaser;

    public H2O() {
        semO = new Semaphore(1);
        semH = new Semaphore(2);
        phaser = new Phaser(3);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		semH.acquire();
        
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        phaser.arriveAndAwaitAdvance();
        phaser.arriveAndAwaitAdvance();
        
        semH.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        semO.acquire();
        
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
		phaser.arriveAndAwaitAdvance();
        releaseOxygen.run();
        phaser.arriveAndAwaitAdvance();
        
        semO.release();
    }
}