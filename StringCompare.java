
public class StringCompare {
	public static void main(String[] args) {
		String str1="Fujitsu";
		String str2=new String();
		str2="Fujitsu";
		String str3=new String("Fujitsu");
		String str4=new String();
		str4="Fujitsu";
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		System.out.println(str4==str2);
		String s1="india",s2="india";
		System.out.println("fujitsu"+s1==s2);
	}

}
