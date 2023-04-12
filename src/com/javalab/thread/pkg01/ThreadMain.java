package com.javalab.thread.pkg01;
/**
 * 실행클래스
 */
public class ThreadMain { // class s

	public static void main(String[] args) { // main s
		
		// 1. 위에서 정의 해놓은 MyThread 클래스 사용해서 스레드 객체 생성
		MyThread t1 = new MyThread();
		
		// 스레드 실행
		t1.start();
 	} // main e

} // class e
