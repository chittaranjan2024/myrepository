package com.test;

public class DaemonThreadExample {

	public static void main(String[] args) {
		
		DemoThread demoThread=new DemoThread();
		demoThread.setDaemon(true);
		demoThread.start();
		System.out.println(demoThread.isDaemon()); 
		System.out.println(demoThread.isAlive()); 
		System.out.println(demoThread.isInterrupted()); 
	}

}
