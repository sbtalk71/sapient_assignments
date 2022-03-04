package threads;

public class PrintWorker implements Runnable {

	private Resource res;
	private String message;

	public PrintWorker(Resource res, String message) {
		this.res = res;
		this.message = message;
	}

	@Override
	public void run() {
		//res.printMessage(message);
		synchronized (res) {
			res.printMessage(message);
		}
	}

}
