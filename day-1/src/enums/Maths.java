package enums;

public enum Maths {

	PI(3.14), g(9.8);

	private double constValue;

	private Maths(double value) {
		this.constValue = value;
	}

	public double getConstValue() {
		return this.constValue;
	}
}

class TestEnum{
	public static void main(String[] args) {
		System.out.println(Maths.PI.getConstValue());
	}
}

