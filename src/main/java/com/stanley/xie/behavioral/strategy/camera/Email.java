package com.stanley.xie.behavioral.strategy.camera;

public class Email implements ShareStrategy {
	public void share() {
		System.out.println("I'm emailing the photo");
	}
}
