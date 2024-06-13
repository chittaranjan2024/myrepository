package com.test;
class DemoThread extends Thread
{
	@Override
	public void run() {
		 for(int i=1;i<=10;i++)
		 {
			 try {
				Thread.sleep(2000,1000);
			} 
			 catch (InterruptedException e) {
				 System.out.println(e);
			}
			 System.out.println(Thread.currentThread().getName()+":"+ i);
			
		 }	
	}
}
public class ThreadSleep {

	public static void main(String[] args) {
		DemoThread thread1=new DemoThread();
		thread1.start();

		DemoThread thread2=new DemoThread();
		thread2.start();
	}

}
