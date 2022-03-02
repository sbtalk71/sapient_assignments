package abstractdemo;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println("Cat Named "+super.getName()+" Meows...");
	}
	
	public String getBreed() {
		return "Ragdoll";
	}
}
