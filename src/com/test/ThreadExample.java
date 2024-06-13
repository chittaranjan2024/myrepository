package com.test;

class MyThread extends Thread
{
	 public void run()
	 {
		 for(int i=1;i<=1000;i++)
		 {
			 System.out.println(Thread.currentThread().getName()+":"+i);
		 }
		 System.out.println(Thread.currentThread().getName()+" completed");
	 }
}

public class ThreadExample {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		t1.setName("thread1");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		MyThread t2=new MyThread();
		t2.setName("thread2");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();

	}

}
