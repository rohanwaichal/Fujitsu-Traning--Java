
public class CallingSequence {
	static {

		System.out.println("within static block1");
		
	}
	{//Non-static block

		System.out.println("within instance block1");
		instanceMethod();
		staticMethod();
	}

	void instanceMethod() {
		System.out.println("within instance method");

	}

	static void staticMethod() {
		System.out.println("within static method");

	}

	static {

		System.out.println("within static block2");
		staticMethod();
		CallingSequence callingSequence = new CallingSequence();
		callingSequence.instanceMethod();
	}
	static {

		System.out.println("within static block3");

	}

	public CallingSequence() {

		System.out.println("In constructor");
	}

	public static void main(String[] args) {
		CallingSequence callingSequence1 = new CallingSequence();
	}
}
