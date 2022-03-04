package threads;

public class MainApp1 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main thread enters..");
		System.out.println(Thread.currentThread());
		MyThread t1= new MyThread(); //new thread
		MyThread t2= new MyThread();
		t1.setPriority(8);
		t2.setPriority(9);
		t2.start();
		t1.start(); //Runnable
		
		
		t1.join();
		t2.join();
		System.out.println("main thread exits..");

	}

}
