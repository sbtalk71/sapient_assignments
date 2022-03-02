package inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		Person john = new Person(100,"John");

		String details = john.getDetails();
		System.out.println(details);
		
		Employee e= new Employee(101, "Pinto", 45000);
		System.out.println(e.getDetails());
		
		TraineeEmployee te= new TraineeEmployee(102, "Rinku", 56000, "good");
		System.out.println(te.getDetails());
		
	}

}
