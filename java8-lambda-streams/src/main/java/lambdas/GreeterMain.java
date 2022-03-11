package lambdas;

import java.util.Iterator;

public class GreeterMain {

	public static void main(String[] args) {
		
		GreetService service=new GreetService();
		service.printGreeting(new GoodMorning());
		
		service.printGreeting(new Greeter() {
			
			public String greet() {
				return "Good Evening";
			}
		});

		Greeter night=()->"Good Night";
		
		service.printGreeting(()->"Good afternoon");
		
		
		new Thread(()->{
			
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		).start();
	}

}

class GoodMorning implements Greeter {
	public String greet() {

		return "Good Morning";
	}
}