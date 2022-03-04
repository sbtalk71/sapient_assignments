package lang.etc;

public class Strings {

	public static void main(String[] args) {
		String s1="hello";
		
		String s2="Hello";
		
		String s3="hello";
		
		String s4=new String("hello");
		
		
		System.out.println(s1==s3);
		
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		
		String s5="good morning";
		s5="good morning john";
		

	}

}
