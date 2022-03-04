package lang.etc;

public class WrapperAndBoxing {
	public static void main(String[] args) {
		int x = 10;
		Integer i= new Integer(x); //prior to Java 1.5
		double d=3.1; //8 bytes
		
		Integer a = x; //AutoBoxing
		
		int y=a;//auto unboxing
		String s="john";
		System.out.println(Integer.parseInt(s));
		
	}
}
