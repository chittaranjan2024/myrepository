package com.test;
class SampleThread implements Runnable
{

	@Override
	public void run() {
		 for(int i=1;i<=10;i++)
		 {
			 System.out.println(i);
			 System.out.println(Thread.currentThread().getId());
			 System.out.println(Thread.currentThread().getName());
			 System.out.println(Thread.currentThread().getState());
			 System.out.println(Thread.currentThread().getPriority());
			
		 }	
	}
	
}
public class ThreadExample1 {

	public static void main(String[] args) {
		
		SampleThread sampleThread=new SampleThread();
		Thread thread=new Thread(sampleThread);
		
		thread.start();

	}

}
