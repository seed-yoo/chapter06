package com.javaex.ex04;

public class LowerImpl implements Runnable {

	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z' ; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
