package com.javaex.ex03;

public class Ex01 {
	
	public static void main(String[] args) throws InterruptedException{
		// 출장 1~20
		
		/*
		DigitThreadImpl dt = new DigitThreadImpl();
		Thread thread = new Thread(dt);
		*/
		Thread thread = new Thread(new DigitThreadImpl());
		thread.start();
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
	}
}
