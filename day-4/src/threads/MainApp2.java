package threads;

public class MainApp2 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main thread enters..");
		Runnable target1=new WorkerThread();
		Runnable target2=new WorkerThread();
		
		Thread t1=new Thread(target1);
		Thread t2=new Thread(new WorkerThread());
		
		t2.start();
		t1.start(); //Runnable
		
		t1.join();
		t2.join();
		System.out.println("main thread exits..");

	}

}
