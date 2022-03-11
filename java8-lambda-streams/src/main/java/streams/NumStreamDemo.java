package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStreamDemo {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 56, 23, 45, 65, 12, 78, 90, 24, 56);

		//nums.stream().filter(t -> t % 2 == 0).forEach(System.out::println);
		List<Integer> nums2 = nums.stream().filter(t -> t % 2 != 0).map(t -> 2 * t).collect(Collectors.toList());
		
		nums2.forEach(System.out::println);
		
		System.out.println(nums.stream().reduce((a,b)->a+b).get());
		
		
		

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