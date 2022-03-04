package threads;

public class Resource {

	public synchronized void printMessage(String message) {

		try {
			System.out.print("["+message);
			Thread.sleep(5000);
			System.out.println("]");  //[message]

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
