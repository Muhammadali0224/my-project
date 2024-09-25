package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    Lock lock = new ReentrantLock();
    Object objectLock = new Object();
    private int sum;

    public Counter(int sum) {
        this.sum = sum;
    }

    public synchronized void counter(){
//        lock.lock();
//        synchronized (objectLock) {
            setSum(getSum() + 1);
//        }
//            lock.unlock();

    }


    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}
