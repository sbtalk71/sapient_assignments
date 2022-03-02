package abstractdemo;

abstract public class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract void talk();
	
	
}
