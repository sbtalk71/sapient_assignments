package inheritance;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println("DOg Named "+getName()+" barks...");
	}
}
