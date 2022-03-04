package interfaces;

public interface Greeter {

	public void morningGreeting();

	public void eveningGreeting();
	default void nightGreeting() {};

}