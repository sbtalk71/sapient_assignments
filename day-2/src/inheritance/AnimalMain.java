package inheritance;

public class AnimalMain {

	public static void main(String[] args) {
		Dog fido = new Dog("fido");
		//fido.talk();

		Cat tom = new Cat("Tom");
		//tom.talk();
		
		Animal animal;
		animal=fido;
		animal.talk();
		
		animal=tom;
		animal.talk();
		
		

	}

}
