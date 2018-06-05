package com.zhngye.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterRunner implements Runnable {
	private CircularCounter counter;
    private CountDownLatch latch1;
    private CountDownLatch latch2;
    private AtomicInteger count;

    public CounterRunner(CircularCounter counter, CountDownLatch latch1, CountDownLatch latch2, AtomicInteger count) {
        this.latch1 = latch1;
        this.latch2 = latch2;
        this.counter = counter;
        this.count = count;
    }

    @Override
    public void run() {

        try {
            latch1.await();
            System.out.println("****************");

            for (int i = 0; i < 20; i++) {
            	System.err.println(counter.addAndGet());
                count.addAndGet(1);
            }
            latch2.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
