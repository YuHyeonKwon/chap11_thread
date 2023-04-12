package com.javalab.thread.pkg04;

import javax.swing.JOptionPane;

/**
 * [싱글스레드]
 * - 사용자에게 입력받은 부분과 숫자 출력하는 부분을 하나의 스레드로 처리
 * - 사용자의 입력이 끝나야 화면에 숫자가 출력된다.
 */
public class ThreadEx07 { // class s

	public static void main(String[] args) throws Exception { // main s
		
		ThreadEx7_1 th1 = new ThreadEx7_1();
		th1.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		
		System.out.println("입력하신 값은 " + input + "입니다");
		
	} // main e

} // class e

class ThreadEx7_1 extends Thread{
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			}catch (Exception e) {
			}
		}
	}
}