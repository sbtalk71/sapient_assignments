package lang.etc;

public class EqualsHashCodeDemo {
	
	public static void main(String[] args) {
		Person p1=new Person(100, "John");
		Person p2=new Person(100, "John");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode()==p2.hashCode());
	}
}
