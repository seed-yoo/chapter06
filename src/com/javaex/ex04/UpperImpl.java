package com.javaex.ex04;

public class UpperImpl implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i <= 25 ; i++) {
			System.out.println(100);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		
		
	}

	
}
