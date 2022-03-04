package lang.etc;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder();
		sb.append("Shantanu").append(" Banerjee").append(" Hyderabad ").append(500058);
		
		System.out.println(sb);
		
		//replace my name with yours and delete Hyderabad
		sb.replace(0, 17, "Trainer");
		System.out.println(sb);
		

	}

}
