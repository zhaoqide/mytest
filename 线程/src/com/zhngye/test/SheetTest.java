package com.zhngye.test;

public class SheetTest {
	public static void main(String[] args) throws InterruptedException {
		Thread thread01 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.err.println("线程一");
			}
		});
		Thread thread02 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.err.println("线程二");
			}
		});
		thread01.start();
		thread02.start();
		thread01.join();
		thread02.join();
		System.err.println("所有线程已完成");
	}
}
