package threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		Thread t= Thread.currentThread();
		System.out.println("Priority of "+t.getName()+" is "+t.getPriority());
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Executing code by " + Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
