package ch05.ex09;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockResource implements AutoCloseable {
    private ReentrantLock reentrantLock;

    public ReentrantLockResource() {
        reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        System.out.println("Locking");
    }

    @Override
    public void close() {
        reentrantLock.unlock();
        System.out.println("Unlocking");
    }
}
