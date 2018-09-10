
public class StringBuf {

	public static void main(String[] args) {
		System.out.println("========StringBuffer=======");
		StringBuffer sb = new StringBuffer("Fujitsu");
		System.out.println(sb.append("india"));
		System.out.println(sb);
		System.out.println("========String=======");
		String str = new String("Fujitsu");
		System.out.println(str.concat("india"));
		System.out.println(str);
	}

}
