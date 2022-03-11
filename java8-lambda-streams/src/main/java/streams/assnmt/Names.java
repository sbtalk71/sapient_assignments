package streams.assnmt;

import java.util.Arrays;
import java.util.List;

public class Names {

	public static void main(String[] args) {
		
		
		
      List<String> list = Arrays.asList("Shantanu","John","Peter","Robin","Kirthi","Soham","Jonny","Sheetal","Shankar");
		
		list.stream().filter(name->name.length()>5).forEach(System.out::println); 

		
		list.stream().filter(n->n.startsWith("Sh")).map(s->"Hello "+s).forEach(n->System.out.println(n));
		
		
		list.stream().map(s->s.length()).forEach(System.out::println);

	}

}
