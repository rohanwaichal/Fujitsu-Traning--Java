
public class CallUsingObj {

	public void method1() {

		System.out.println("In method 1");
	}

	private void method2() {

		System.out.println("In method 2");
	}

	public static void main(String[] args) {
		CallUsingObj obj1 = new CallUsingObj();
		obj1.method1();
		obj1.method2();

	}

}
