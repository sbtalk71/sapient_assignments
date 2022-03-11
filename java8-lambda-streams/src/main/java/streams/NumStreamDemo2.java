package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStreamDemo2 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,3,5,6,8,9,23,45,667,887,90);

		
		System.out.println(nums.stream().reduce((a,b)->a+b).get());
		
		System.out.println(nums.stream().max((n1,n2)->n1.compareTo(n2)).get());
		System.out.println(nums.stream().min((n1,n2)->n1.compareTo(n2)).get());
		
		
		

	}

}

/*
 * class EvenFilter implements Predicate<Integer> {
 * 
 * @Override public boolean test(Integer t) { if (t % 2 == 0) { return true; }
 * else return false; }
 * 
 * }
 */