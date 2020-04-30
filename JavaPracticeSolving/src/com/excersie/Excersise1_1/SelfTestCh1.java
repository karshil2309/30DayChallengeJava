package com.excersie.Excersise1_1;

public class SelfTestCh1 extends Rocket {

	public static void main(String args[]) {
		
		new SelfTestCh1().go();
	}
	void go() {
		blastOff();
//		Rocket.blastOff();
	}
	private void blastOff() {
		System.out.println("sh-bang ");
	}
}

class Rocket{
	private void blastOff() {
		System.out.println("sh-bang ");
	}
}
