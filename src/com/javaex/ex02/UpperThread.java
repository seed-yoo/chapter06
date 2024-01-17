package com.javaex.ex02;

public class UpperThread extends Thread {

	public void run() {
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println(5);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
