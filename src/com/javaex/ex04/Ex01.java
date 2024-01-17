package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		
		Thread thread01 = new Thread(new DigitThreadImpl());
		Thread thread02 = new Thread(new LowerImpl());
		Thread thread03 = new Thread(new UpperImpl());
		
		thread01.start();
		thread02.start();
		thread03.start();
		
	}
}
