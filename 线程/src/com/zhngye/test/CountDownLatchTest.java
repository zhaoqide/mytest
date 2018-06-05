package com.zhngye.test;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
	static CountDownLatch cdl=new CountDownLatch(2);
	public static void main(String[] args) throws InterruptedException {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.err.println("1");
				cdl.countDown();
				System.err.println("2");
				cdl.countDown();
			}
		}).start();
		cdl.await();
		System.err.println("3s");
	}
}
