package chapter1;
class ExtnOfThread extends Thread {
	public void run(){
		System.out.println("Extension of Thread, 1");
		try {
			sleep(1000);
		} catch (InterruptedException ie) {}
		System.out.println("Extension of Thread, 2");
	}
}
class ImplOfRunnable implements Runnable {
	public void run(){
		System.out.println("Implementation of Runnable");
	}
}

public class ThreadExample {
	public static void main(String[] args){
		ExtnOfThread t1 = new ExtnOfThread();
		t1.start();
		Thread t2 = new Thread (new ImplOfRunnable());
		t2.start();
	}	
}