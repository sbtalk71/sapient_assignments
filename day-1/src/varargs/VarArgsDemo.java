package varargs;

public class VarArgsDemo {

	public void add(int... x) {
		int sum = 0;
		if (x.length == 0) {
			System.out.println("pass some numbers..");
			return;
		} else {
			for (int i : x) {
				sum = sum + i;
			}
		}
		System.out.println("sum= " + sum);
	}

	/*
	 * public void add(boolean ...flag) { System.out.println(flag.length); }
	 */
	/*
	 * public void add(String... names) { System.out.println(names.length); }
	 */

	public void add(double... y) {
		System.out.println(y.length);
	}

	public static void main(String[] args) {
		VarArgsDemo va = new VarArgsDemo();
		va.add(1,2,3,4,5,10.0);
	}

}
