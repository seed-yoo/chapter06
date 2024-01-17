package com.javaex.ex04;

public class DigitThreadImpl implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 25; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	
}
