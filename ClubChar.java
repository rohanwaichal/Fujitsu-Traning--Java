

public class ClubChar {
	public static void main(String args[]) {

		char data[] = { 'R', 'o', 'h', 'a', 'n' };
		System.out.println(data);
		String str = new String(data);
		System.out.println(str);
		char c = "Bhagyashri".charAt(4);
		System.out.println(c);

		System.out.println(String.valueOf(data));

		System.out.println(String.valueOf(data).equals(str));
	}

}
