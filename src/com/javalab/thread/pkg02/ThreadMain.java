package com.javalab.thread.pkg02;
/**
 * 실행클래스
 */
public class ThreadMain { // class s

	public static void main(String[] args) { // main s

		// 1. 별도의 파일로 정의 해놓은 MyThread 클래스를 객체로 생성
		Runnable rb = new MyThread();	// 구현객체를 생성해서 인터페이스(부모)에 저장
		
		// 2. Runnable 구현한 구현 객체를 Thread 클래스의 생성자로 전달
		Thread t1 = new Thread(rb);
		
		// 스레드 실행
		t1.start();
	} // main e

} // class e
